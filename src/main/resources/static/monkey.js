var flag = true
if (flag) {
    console.log("第一次进入")
    flag = false;
    var chaptersTitles = document.querySelectorAll("[name='zj']");
    var urls = new Array();
    i = 1;
    var worker = setInterval(function () {
        if (i >= chaptersTitles.length) {
            clearInterval(worker);
            i = 0;
            collectUrl();
            return;
        }
        chaptersTitles[i].click();
        i++;
    }, 1 * 1000);

    function collectUrl() {
        var chapters = document.querySelectorAll("li");
        console.log("total", chapters.length);
        var worker = setInterval(function () {
            if (i >= chapters.length) {
                clearInterval(worker);
                i = 0;
                start();
                return;
            }
            if ('nAll' === chapters[i].className) {
                console.log("第" + i + "章已完成...");
                i++;
                return;
            } else {
                if (chapters[i].childNodes[0].href) {
                    urls.push(chapters[i].childNodes[0].href);
                } else {
                    i++;
                    return;
                }
            }
            i++;
        }, 1 * 1000);
    }

    function start() {
        var worker = setInterval(function () {
            if (i >= urls.length) {
                clearInterval(worker);
                return;
            }
            window.location.href = urls[i];
            setTimeout(function () {
                console.log("开始刷课！")
            }, 10 * 1000);
            i++;
        }, 1 * 1000);
    }
} else {
    console.log("不是第一次进入");
}