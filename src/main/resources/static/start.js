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
window.location.reload();
setTimeout(function () {
    $pages = $('.nHalf');
    var url = $($pages[0]).children('a:first').attr('href');
    window.location.href = url;
},1500);



