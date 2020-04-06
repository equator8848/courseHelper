# 一个弱智的至善网刷题助手
> 只刷题，媒体评论可以使用之前的那个刷客来刷，时间可以按住Ctrl点击章节并行地刷时间。
> 部分题目没有答案是因为导入题库的那个账号有没做完的，或者机会用完了的
> 目前有题库：毛概
## 思路
### 弱智在哪里呢？
- 只能做题，哈哈哈 [至善网刷客，作者：超级马丁](至善网.zip)
- 需要手动换页，希望有大佬告诉我怎么换页（单纯的Js实现）
### 导入题库（导入一次即可）
1. 找到一个基本做完了的的至善网账号
2. 进入第一章第一节的页面
3. 开启浏览器控制台
4. 输入对应代码即可上传答案（将问题与答案上传到服务器保存）
5. 进入第一章第二节的页面，重复以上步骤
6. [Js代码](/src/main/resources/static/singleUoloadAnswer.js) 
```
// 上传答案
var s = document.createElement('script');
s.src = "https://www.equator8848.xyz/courseHelper/singleUoloadAnswer.js";
s.charset = 'utf-8';
document.getElementsByTagName('head')[0].appendChild(s);
```
### 开始刷题
1. 正常登录自己的至善网账号
2. 进入第一章第一节的页面
3. 开启浏览器控制台
4. 输入对应代码即可自动作答（从服务器获取答案）
5. 进入第一章第二节的页面，重复以上步骤
6. [Js代码](/src/main/resources/static/singleGetAnswer.js) 
```
// 回答问题
var s = document.createElement('script');
s.src = "https://www.equator8848.xyz/courseHelper/singleGetAnswer.js";
s.charset = 'utf-8';
document.getElementsByTagName('head')[0].appendChild(s);
```
7. 小技巧 如果之前的都完成了的话，可以使用如下代码快速找到哪些页面没有刷
```
$pages = $('.nHalf');
var url = $($pages[0]).children('a:first').attr('href');
window.location.href = url;
```
## 图片
- 输入指令
![avatar](src/main/resources/images/控制台输入代码.jpg)
- 等待
![avatar](src/main/resources/images/答题完毕.jpg)
- 完成，切换到下一个章节
![avatar](src/main/resources/images/答题完毕自动刷新.jpg)
