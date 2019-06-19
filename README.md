# Struts2-
Struts2学习笔记
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
