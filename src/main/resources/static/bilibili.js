// 哔哩哔哩点赞
var likeSpanDoms = document.getElementsByClassName('like');
var nextPageBtn = document.getElementsByClassName('next')[0];
var idx = 0;
var worker = setInterval(function () {
    if (idx >= likeSpanDoms.length) {
        clearInterval(worker);
        console.log('本页已完成~');
        nextPageBtn.click();
        setTimeout(function () {
            likeSpanDoms = document.getElementsByClassName('like');
            idx = 0;
        }, 2000);
        return;
    }
    if (likeSpanDoms[idx].className.indexOf('liked') > 0) {
        console.log(idx, "已经点赞~");
        idx++;
        return;
    }
    if ((new Date().getTime()) & 1 === 1) {
        likeSpanDoms[idx].click();
    }
    idx++;
}, 3000);