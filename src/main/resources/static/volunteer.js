var contentItems = document.getElementsByClassName('fb_component')
for (var i = 0; i < contentItems.length; i++) {
    titleItem = contentItems[i].getElementsByClassName('fbc_title')[0];
    titleText = titleItem.textContent;
    titleText = titleText.replace("*", "");
    if (titleText) {
        // console.log(titleText);
        if ("姓名" === titleText) {
            var inputItem = contentItems[i].getElementsByClassName('fbi_input')[0];
            inputItem.value = '李彬楷';
        }
        if ("学号" === titleText) {
            var inputItem = contentItems[i].getElementsByClassName('fbi_input')[0];
            inputItem.value = "2017212019";
        }
        if ("身份证" === titleText) {
            var inputItem = contentItems[i].getElementsByClassName('fbi_input')[0];
            inputItem.value = "123456";
        }
        if ("邮箱" === titleText) {
            var inputItem = contentItems[i].getElementsByClassName('fbi_input')[0];
            inputItem.value = "841116931@qq.com";
        }
    }
}