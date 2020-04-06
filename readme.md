# 一个弱智的至善网刷题助手
> 目前有题库：毛概
## 思路
### 弱智在哪里呢？
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

