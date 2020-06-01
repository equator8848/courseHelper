# 一个弱智的至善网刷题助手
> FBI Warning ! 最好还是一节一节的刷吧，多开标签页太嚣张了，十多分钟就刷完了

> 如果网络不好的话，有可能会导致媒体评论有的没刷完，重新运行一下脚本就行了

> 全部开发也就1.5天，比较简陋，哈哈哈（没啥可供学习的，思路是使用一个已经刷完的账号去获取题库，然后其他人都可以刷题了）

> 部分题目没有答案是因为导入题库的那个账号有没做完的，或者机会用完了的

> 目前有题库：毛概，马克思，近代史（2020年），题库可能过时的，保险起见可以找已经做完的同学弄一下题库

> 查看请求总次数（刷完一次课可能请求三四百次，开发仓促，没多设计） `https://www.equator8848.xyz/courseHelper/api/data/getRequestTimes`

## 最佳实践（写在前面）
1. 进入课程页面
2. 按住键盘Ctrl键，点击每一节的标题打开多个标签页（可以并行地刷时间）
![avatar](src/main/resources/images/多开.png)
![avatar](src/main/resources/images/标签页多开.jpg)
3. 在每一个标签页按F12呼出控制台，输入命令，等待即可时间刷完即可
```
媒体与问题
var s = document.createElement('script');
s.src = "https://www.equator8848.xyz/courseHelper/singleGetAnswerAndMedia.js";
s.charset = 'utf-8';
document.getElementsByTagName('head')[0].appendChild(s);
```
```
只回答问题
var s = document.createElement('script');
s.src = "https://www.equator8848.xyz/courseHelper/singleGetAnswer.js";
s.charset = 'utf-8';
document.getElementsByTagName('head')[0].appendChild(s);
```
## 思路

### 弱智在哪里呢？
- 只能做题和刷媒体评论，哈哈哈
- 这里也有刷时间与媒体评论的软件（功能很完善，但是没有题库），不过基本用不上了 [至善网刷客，作者：超级马丁](至善网.zip)
- 需要手动换页，希望有大佬告诉我怎么换页（单纯的Js实现，最近的一个思路是使用iframe打开，可能这样会便于全局调控，但是我没有试过）


### 刷题
1. 正常登录自己的至善网账号
2. 进入第一章第一节的页面
3. 开启浏览器控制台
4. 输入对应代码即可自动作答（从服务器获取答案）
5. 进入第一章第二节的页面，重复以上步骤
6. [Js代码](/src/main/resources/static/singleGetAnswer.js) 

### 导入题库（导入一次即可）
1. 找到一个基本做完了的的至善网账号
2. 进入第一章第一节的页面
3. 开启浏览器控制台
4. 输入对应代码即可上传答案（将问题与答案上传到服务器保存）
5. 进入第一章第二节的页面，重复以上步骤
6. [Js代码](/src/main/resources/static/singleUoloadAnswer.js) 
7. 为了防止答案被污染，上传通道需要密钥，请联系管理员获取！
```
var s = document.createElement('script');
s.src = "https://www.equator8848.xyz/courseHelper/singleUoloadAnswer.js";
s.charset = 'utf-8';
document.getElementsByTagName('head')[0].appendChild(s);
```


## 截图说明
- 输入指令
![avatar](src/main/resources/images/控制台输入代码.jpg)
- 等待
![avatar](src/main/resources/images/答题完毕.jpg)
- 完成，切换到下一个章节
![avatar](src/main/resources/images/答题完毕自动刷新.jpg)

## 打赏
- ![avatar](src/main/resources/images/donate.jpg)
