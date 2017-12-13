<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<meta charset="UTF-8">
<title>登录</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" type="text/css" href="../layui/css/layui.css"
	media="all">
<link rel="stylesheet" type="text/css" href="../style/login.css"
	media="all">


</head>

<body>
	<div class="layui-canvs"></div>
	<form action="/usedcar/user/login" method="post">
		<div class="layui-layout layui-layout-login">
			<h1>
				<strong>二手车交易大数据预测分析平台</strong> <em>Second-hand car trading big
					data analysis platform</em>
			</h1>
			<div class="layui-user-icon larry-login">
				<input type="text" id="username" name="username" placeholder="账号"
					class="login_txtbx" />
			</div>
			<div class="layui-pwd-icon larry-login">
				<input type="password" id="password" name="password" placeholder="密码"
					class="login_txtbx" />
			</div>
			<div class="layui-submit larry-login">
				<input type="submit" value="登陆" class="submit_btn" />
			</div>

			<div class="layui-addition larry-login">
				<a class="register" href="register.html">免费注册</a> <a class="forget"
					href="modify_passwd.html">忘记登录密码?</a>
			</div>

			<div class="layui-login-text">
				<p>© 2017 derder 版权所有</p>
			</div>
		</div>
	</form>
</body>
<script type="text/javascript" src="../layui/lay/dest/layui.all.js"></script>
<script type="text/javascript" src="../js/login.js"></script>
<script type="text/javascript" src="../js/jparticle.jquery.js"></script>
<script type="text/javascript">
	$(function() {
		$(".layui-canvs").jParticle({
			background : "#141414",
			color : "#E6E6E6"
		});

		//登录链接测试，使用时可删除
		$(".submit_btn").click(function() {
		});
	});
</script>
</html>
