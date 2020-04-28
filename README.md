**Java基于Spring boot的i18n国际化demo**

**一、启动步骤：**

· jdk相关配置跳过

· 导入idea，等待项目、maven jar都加载完成

· 找到项目中com.free.yrl.demospringbooti18n.DemoSpringbootI18nApplication文件

· 点击按钮，如下图所示：

![Image text](https://github.com/YaoRenLiang/demo-springboot-i18n/blob/master/src/main/resources/static/imgs/1.jpg)

· 启动成功之后，如下图所示：

![Image text](https://github.com/YaoRenLiang/demo-springboot-i18n/blob/master/src/main/resources/static/imgs/2.png)

· 打开浏览器访问http://localhost:8080/doc.html

![Image text](https://github.com/YaoRenLiang/demo-springboot-i18n/blob/master/src/main/resources/static/imgs/3.png)

· 目前支持的语种，如下图所示：

![Image text](https://github.com/YaoRenLiang/demo-springboot-i18n/blob/master/src/main/resources/static/imgs/4.png)

（en-英语、ja-日语、zh-中文），以后增加新的语种只需要copy一份文件对应内容更改就行。

· 目前自定义的错误码，如下图所示：

![Image text](https://github.com/YaoRenLiang/demo-springboot-i18n/blob/master/src/main/resources/static/imgs/5.png)


**二、代码详解：**