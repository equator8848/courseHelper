// 测试
var s = document.createElement('script');
s.src = "https://www.equator8848.xyz/courseHelper/sayHello.js";
s.charset = 'utf-8';
document.getElementsByTagName('head')[0].appendChild(s);

// 上传答案
var s = document.createElement('script');
s.src = "https://www.equator8848.xyz/courseHelper/singleUoloadAnswer.js";
s.charset = 'utf-8';
document.getElementsByTagName('head')[0].appendChild(s);

// 回答问题
var s = document.createElement('script');
s.src = "https://www.equator8848.xyz/courseHelper/singleGetAnswer.js";
s.charset = 'utf-8';
document.getElementsByTagName('head')[0].appendChild(s);

// next
$pages = $('.nHalf');
var url = $($pages[0]).children('a:first').attr('href');
window.location.href = url;

setInterval(function () {
    $pages = $('.nHalf,.on');
    var url = $($pages[0]).children('a:first').attr('href');
    window.location.href = url;
    setTimeout(function () {
        var s = document.createElement('script');
        s.src = "https://www.equator8848.xyz/courseHelper/singleGetAnswer.js";
        s.charset = 'utf-8';
        document.getElementsByTagName('head')[0].appendChild(s);
    }, 10 * 1000);
}, 30 * 1000);



