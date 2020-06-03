**Java 基于 Spring boot 的 i18n 国际化 Demo**

**一、启动步骤：**

· Jdk 相关配置跳过

· 导入 Idea，等待 Maven、Jar 都加载完成

· 找到项目中 com.free.yrl.demospringbooti18n.DemoSpringbootI18nApplication 文件

· 点击按钮，如下图所示：

![Image text](https://github.com/YaoRenLiang/demo-springboot-i18n/blob/master/src/main/resources/static/imgs/1.jpg)

· 启动成功之后，如下图所示：

![Image text](https://github.com/YaoRenLiang/demo-springboot-i18n/blob/master/src/main/resources/static/imgs/2.png)

· 打开浏览器访问http://localhost:8080/doc.html

![Image text](https://github.com/YaoRenLiang/demo-springboot-i18n/blob/master/src/main/resources/static/imgs/3.png)

· 目前支持的语种，如下图所示：

![Image text](https://github.com/YaoRenLiang/demo-springboot-i18n/blob/master/src/main/resources/static/imgs/4.png)

（en-英语、ja-日语、zh-中文），以后增加新的语种只需要 Copy 一份文件对应内容更改就行。

· 目前自定义的错误码，如下图所示：

![Image text](https://github.com/YaoRenLiang/demo-springboot-i18n/blob/master/src/main/resources/static/imgs/5.png)



**二、代码详解：**