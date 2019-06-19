# 在web.xml 中配置核心过滤器
在Struts2.1.3--2.5之间核心控制器为 org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter
```
<filter>
	 <filter-name>struts2</filter-name>
	 <filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
 </filter>
 <filter-mapping>
 	<filter-name>struts2</filter-name>
	<url-pattern>/*</url-pattern>
```
在Struts2.1.3以下核心控制器为 org.apache.struts2.dispatcher.dispatcher.FilterDispatcher
```
<filter>
	 <filter-name>struts2</filter-name>
	 <filter-class>org.apache.struts2.dispatcher.dispatcher.FilterDispatcher</filter-class>
 </filter>
 <filter-mapping>
 	<filter-name>struts2</filter-name>
	<url-pattern>/*</url-pattern>
```
在Struts2.5以上核心控制器为 org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
```
<filter>
	 <filter-name>struts2</filter-name>
	 <filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
 </filter>
 <filter-mapping>
 	<filter-name>struts2</filter-name>
	<url-pattern>/*</url-pattern>
```
# 配置struts.xml
注意struts.xml文件必须放在src的根目录下（struts_basic/src/struts.xml）,因为发布后src下的文件会被IDE转移到项目的class path的根目录下，这是struts2的规范。
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE struts PUBLIC
    "-//Apache Software Foundation//DTD Struts Configuration 2.5//EN"
    "http://struts.apache.org/dtds/struts-2.5.dtd">

<struts>
	<!-- 启动开发者模式 -->
    <constant name="struts.devMode" value="true" />

    <package name="struts_basic" extends="struts-default">
        <action name="index">
            <result>/index.jsp</result>
        </action>
    </package>

</struts>
```
##  添加 jar 包
使用精简版lib
## 
新建 index.jsp

```
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>
  <body>
    <h1>Welcome To Struts 2!</h1>
  </body>
</html>
```
