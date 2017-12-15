<%@page import="com.zxd.usedcar.model.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<title>二手车交易大数据分析平台</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<script src="../layui/layui.all.js" charset="utf-8"></script>
<script src="../layui/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="../layui/css/layui.css" media="all">
<link rel="stylesheet" href="../style/global.css" media="all">
<link rel="stylesheet" href="../style/index.css" media="all">
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
	<!-- 导航栏的东西 -->
	<div class="layui-header header">
		<div class="layui-main">
			<a class="logo" href="main.html" title="二手车交易大数据分析平台"> <img
				src="../img/logo1.png" alt="layui">
			</a>
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item "><a href="main.html">首页</a></li>
				<li class="layui-nav-item "><a href="search.html">搜索</a></li>
				<li class="layui-nav-item "><a href="register_car_info.html">发布信息</a></li>

			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;">我</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="personal_center.html">个人中心</a>
						</dd>
						<dd>
							<a href="login.html">退出</a>
						</dd>
					</dl></li>
			</ul>
		</div>
	</div>

	<!-- 实现搜索
	<div class="layui-container container">
	<form class="layui-form" method="post" action="搜索.html" style="width:50%;padding-top: 90px;padding-left: 30%;">
		<div class="layui-form-item">
		  <div class="layui-input-inline" style="width:50%; "> 
			<input type="text" name="title" lay-verify="required" placeholder="请输入关键字" class="layui-input">
		  </div>
		  <button class="layui-btn" lay-filter="*" lay-submit>搜索</button>
		</div>
	 </form>
	</div>-->



	<div class="site-banner">
		<div class="site-banner-bg"
			style="background-image: url(../img/index3.jpg?v=0); background-color: black;">
		</div>
		<div class="site-banner-main">
			<div class="layui-anim site-desc"></div>
			<div class="site-change">
				<a href="search.html" class="layui-inline site-down" target="_blank">
					<cite class="layui-icon">&#xe615;</cite> 立即搜索
				</a>
			</div>
		</div>
	</div>
	<div class="layui-main">
		<ul class="site-idea">
			<li>
				<fieldset class="layui-elem-field layui-field-title">
					<legend>数据分析</legend>
					<p>身处在大数据分析的繁荣之下，我们奔赴在追求技术的漫漫征途，自信并勇敢着。</p>
				</fieldset>
			</li>
			<li>
				<fieldset class="layui-elem-field layui-field-title">
					<legend>我在等你</legend>
					<p>拥有双面的不仅是人生，还有
						layui。一面极简，一面丰盈。极简是视觉所见的外在，是开发所念的简易。丰盈是倾情雕琢的内在，是信手拈来的承诺。一切本应如此，简而全，双重体验。</p>
				</fieldset>
			</li>
			<li>
				<fieldset class="layui-elem-field layui-field-title">
					<legend>星辰大海</legend>
					<p>如果眼下还是一团零星之火，那运筹帷幄之后，迎面东风，就是一场烈焰燎原吧，那必定会是一番尽情的燃烧。待，秋风萧瑟时，散作满天星辰，你看那四季轮回，正是
						layui 不灭的执念。</p>
				</fieldset>
			</li>
		</ul>

	</div>



	<!-- 尾部-->
	<div class="footer">
		<hr class="layui-bg-red">
		<p>二手车交易大数据分析平台© 2017 derder 版权所有</p>
	</div>

	<script>
		layui.use('element', function() {
			var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

			//监听导航点击
			element.on('nav(demo)', function(elem) {
				//console.log(elem)
				layer.msg(elem.text());
			});
		});
		//搜索
	</script>
	
</body>
</html>