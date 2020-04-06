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
        alert('欢迎使用由Equator提供的刷题脚本（本脚本仅供娱乐）...');
        $pages = $('.nHalf');
        var url = $($pages[0]).children('a:first').attr('href');
        window.location.href = url;




        // 获取一页的答案
        // var $items = $("input[disabled='disabled']");
        // for (var i = 0; i < $items.length; i++) {
        //     $($items[i]).removeAttr('disabled');
        // }
        var attopAnswers = new Array();
        var $questionList = $('.ed-ans');
        for (var i = 0; i < $questionList.length; i++) {
            var questionTitle = $($questionList[i]).find('p:first').html();
            console.log(questionTitle);
            var questionAnswers = $($questionList[i]).find("input[checked='checked']");
            var tempArr = new Array();
            for (var j = 0; j < questionAnswers.length; j++) {
                console.log($(questionAnswers[j]).val());
                tempArr.push($(questionAnswers[j]).val());
            }
            if (tempArr.length > 0) {
                attopAnswers.push({
                    "questionTitle": questionTitle,
                    "answerList": tempArr.join(',')
                });
            }
            console.log('--------');
        }
        console.log(attopAnswers);
        // 上传答案
        // $.post('https://www.equator8848.xyz/courseHelper/api/attop/uploadAnswer',{
        //     attopAnswerReq: attopAnswers
        // },function (data) {
        //     if (data.code == 200) {
        //         console.log('题库上传成功');
        //     }
        // })
        $.ajax({
            type: 'POST',
            url: 'https://www.equator8848.xyz/courseHelper/api/attop/uploadAnswer',
            data: JSON.stringify({
                "attopAnswers": attopAnswers
            }),
            dataType: 'JSON',
            traditional: true,
            headers: {
                "Content-Type": 'application/json;charset=utf-8'
            },
            success: function (data) {
                if (data.status == 200) {
                    console.log('题库上传成功');
                } else {
                    console.log('题库上传失败');
                }
            }
        });
    })
}