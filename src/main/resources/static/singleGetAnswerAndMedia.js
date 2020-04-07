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
        console.log('欢迎使用由Equator提供的刷题脚本（本脚本仅供娱乐，富强民主文明和谐）...');
        // 开始答题！
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
        console.log("请等待一段时间（每道题等待0.8秒），以免提交过快...完成之后请手动切换章节，按方向键上键重复命令")
        setTimeout(function () {
            if ($questionList.length > 0) {
                console.log("有需要提交的题目");
                $('.btn100_org:first').click();
                $('.aui_state_highlight:first').click();
            }
            console.log("题目已完成，开始媒体评论！");
            // 媒体评价
            $mediaBtns = $('.BT_ping');
            idx = 0;
            mediaWork = setInterval(function () {
                if (idx >= $mediaBtns.length) {
                    console.log("媒体评价全部完成!");
                    clearInterval(mediaWork);
                    window.location.reload();
                    return;
                }
                if ($($mediaBtns[idx]).html() == "已评价") {
                    console.log(idx + " 已评价");
                    idx++;
                    return;
                }
                console.log("点击评论按钮");
                $($mediaBtns[idx]).click();
                setTimeout(function () {
                    console.log("点击好评按钮");
                    $("#pageiframe").contents().find(".ping_btn_3:first").click();
                    console.log("点击确认按钮");
                    $("#pageiframe").contents().find(".aui_state_highlight:first").click();
                    console.log("点击关闭按钮");
                    $(".aui_close").click();
                    idx++;
                }, 2 * 1000);
                console.log("------------------");
            }, 5 * 1000);
        }, $questionList.length * 800);
    })
}