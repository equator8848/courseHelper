document.querySelector("script[src='/js/jquery.js']").remove();
// 引入Jquery
var jquery = document.createElement('script');
jquery.src = "https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js";
jquery.async = false;
// document.getElementsByTagName('head')[0].insertBefore(jquery,document.getElementsByTagName('title')[0]);
document.getElementsByTagName('body')[0].appendChild(jquery);
// Uncaught TypeError: $.dialog is not a function Jq引入的顺序导致报错，与bootstrap冲突

jquery.onload = function () {
    $.noConflict();
    jQuery(document).ready(function ($) {
        $.ajaxSetup({
            async: false
        });
        // 中文显示
        console.log('欢迎使用由Equator提供的刷题脚本（本脚本仅供娱乐）...');
        var $questionList = $('.un-ans');
        for (var i = 0; i < $questionList.length; i++) {
            var questionTitle = $($questionList[i]).find('p:first').html();
            $.get('https://www.equator8848.xyz/courseHelper/api/attop/getAnswer', {
                questionTitle: questionTitle
            }, function (data) {
                if (data.status == 200 && data.data) {
                    var anwsers = data.data.split(',');
                    console.log("题目：" + questionTitle + "答案是：" + anwsers);
                    var $inputs = $($questionList[i]).find('input');
                    for (var j = 0; j < $inputs.length; j++) {
                        // console.log(anwsers, $($inputs[j]).val(), anwsers.indexOf($($inputs[j]).val()))
                        if (anwsers.indexOf($($inputs[j]).val()) >= 0) {
                            console.log("答案匹配");
                            $($inputs[j]).attr('checked', 'checked');
                            // $($inputs[j]).click();
                        }
                    }
                } else {
                    console.log("题目：" + questionTitle + "没有找到答案！");
                }
            });
            console.log('--------');
        }
        console.log("请等待三秒，以免提交过快...")
        setTimeout(function () {
            $('.btn100_org:first').click();
            $('.aui_state_highlight:first').click();
            window.location.reload();
        },3000);
    })
}