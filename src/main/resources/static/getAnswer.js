// 引入Jquery
var jquery = document.createElement('script');
jquery.src = "https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js";
jquery.async = false;
document.getElementsByTagName('head')[0].appendChild(jquery);

jquery.onload = function () {
    $(document).ready(function () {
        // 中文显示
        var metaString = '<meta charset="UTF-8">';
        $("head:first").append(metaString);
    })
    alert('欢迎使用由Equator提供的刷题脚本（本脚本仅供娱乐）...');
    // 获取一页的答案
    var $items = $("input[disabled='disabled']");
    for (var i = 0; i < $items.length; i++) {
        $($items[i]).removeAttr('disabled');
    }

    var $questionList = $('.ed-ans');
    for (var i = 0; i < $questionList.length; i++) {
        var questionTitle = $($questionList[i]).find('p:first').html();
        console.log(questionTitle);
        var questionAnswers = $($questionList[i]).find("input[checked='checked']");
        for (var j = 0; j < questionAnswers.length; j++) {
            console.log($(questionAnswers[j]).val());
        }
        console.log('--------');
    }
}