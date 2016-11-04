<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css"
			href="script/jquery-easyui-1.4.3/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css"
			href="script/jquery-easyui-1.4.3/themes/icon.css">
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>css/login.css">
		<script type="text/javascript"
			src="script/jquery-easyui-1.4.3/jquery.min.js"></script>
		<script type="text/javascript"
			src="script/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
		<script type="text/javascript"
			src="script/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
		<style>
			body{
				background:url(image/backgroud1.jpg) top left;
				background-size:100% 100%;
				overflow:hidden;
			}
		</style>

	</head>
	<body onload='document.loginForm.j_username.focus();'>
		<br />
		<center>
			<h1>
				中&nbsp;集&nbsp;信&nbsp;达&nbsp;国&nbsp;际&nbsp;物&nbsp;流
			</h1>
		</center>
		<c:if test="${not empty param.login_error}">
			<font color="red">登录失败，请重试.<br/><br/>原因:<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/></font>
		
		</c:if>
		<div id="login-box"> 		
			<form name='loginForm'
				action="<c:url value='j_spring_security_check' />" method='POST'>
				<table>
					<tr>
						<td>
							用&nbsp;&nbsp;户:
						</td>
						<td>
							<input type='text' name='j_username' value=''>
						</td>
					</tr>
					<tr>
						<td>
							密&nbsp;&nbsp;码:
						</td>
						<td>
							<input type='password' name='j_password' />
						</td>
					</tr>
					<tr>
						<td colspan='2'>
							<input name="submit" type="submit" value="登&nbsp;&nbsp;陆" />
						</td>
					</tr>
				</table>

			</form>
		</div>
	</body>
</html>
