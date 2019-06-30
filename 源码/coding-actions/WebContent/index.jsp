<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>
  <body>
    <h1>Welcome To Struts 2!</h1>
	<!-- Struts 2 url Tag -->
<!-- ****************************************************************** --> 
    <p><a href="<s:url action='hello'/>">Hello World</a></p>
 <!-- ****************************************************************** -->   
	<!-- url tag with param  -->  
	<s:url action="hello" var="helloLink">
	  <s:param name="userName">Bruce Phillips</s:param>
	</s:url>
	<!-- 创建一个链接   指向上面var 的值 -->
	<p><a href="${helloLink}">Hello Bruce Phillips</a></p>
<!-- ****************************************************************** --> 
<!-- Struts 2 Form Tag -->
	<p>Get your own personal hello by filling out and submitting this form.</p>
	
	<s:form action="hello">
	  <s:textfield name="userName" label="Your name" />
	  <s:submit value="Submit" />
	</s:form>

</body>
</html>