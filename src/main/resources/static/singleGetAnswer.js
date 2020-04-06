// 引入Jquery
var jquery = document.createElement('script');
jquery.src = "https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js";
jquery.async = false;
document.getElementsByTagName('head')[0].appendChild(jquery);

jquery.onload = function () {
    $(document).ready(function () {
        // 中文显示
        console.log('欢迎使用由Equator提供的刷题脚本（本脚本仅供娱乐）...');
        var $questionList = $('.un-ans');
        for (var i = 0; i < $questionList.length; i++) {
            var questionTitle = $($questionList[i]).find('p:first').html();
            $.get('https://www.equator8848.xyz/courseHelper/api/attop/getAnswer', {
                questionTitle: questionTitle
            }, function (data) {
                if (data.status == 200 && data.data) {
                    console.log("题目：" + questionTitle+"答案是：" + data.data);
                }else {
                    console.log("题目：" + questionTitle+"没有找到答案！");
                }
            });
            console.log('--------');
        }
    })
}