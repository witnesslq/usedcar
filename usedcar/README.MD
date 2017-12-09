项目：二手车交易大数据预测分析平台

项目类型：J2EE(基于JavaWeb的B/S系统)

实施技术：JavaWeb技术

框架：Spring + SpringMVC + MyBatis[动态代理](后端) + jQuery(前端)

单元测试：基于Spring-JUnit4的整合测试框架

Database:MySQL(主存) + Redis(缓存)

版本控制：git(GitHub)

开发IDE：MyEclipse

包管理工具：Maven

Web中间件：Tomcat

项目架构：MVC(基于Restful API风格的前后端分析)

项目结构：
	src/main/java	
		com.zxd.usedcar.controller ---- 前端控制器，接收请求并响应
		com.zxd.usedcar.mapper ---- mybatis数据库访问接口
		com.zxd.usedcar.mapping ---- mybatis映射文件
		com.zxd.usedcar.model ---- 领域类
		com.zxd.usedcar.service ---- 业务逻辑接口
		com.zxd.usedcar.service.iml ---- 业务逻辑实现
		com.zxd.usedcar.util ---- 项目工具类
	src/main/resources
		applicationContext.xml ---- Spring bean配置文件
		jdbc.properties ----- jdbc数据库连接配置文件
		log4j.properties ---- 基于log4j的日志模块配置文件
		spring-mvc.xml ---- SpringMVC配置文件
		spring-mybatis ---- spring-mybatis整合配置文件(spring动态代理mybatis，mybatis的数据访问接口在spring中自动注入)
	
	src/test/java
	    com.zxd.usedcar.controller ---- 前端控制器测试
	    com.zxd.usedcar.service ---- 业务逻辑测试
	
	logs ---- 日志文件
	
	pom.xml ---- maven配置文件
	README.MD 项目说明文件

