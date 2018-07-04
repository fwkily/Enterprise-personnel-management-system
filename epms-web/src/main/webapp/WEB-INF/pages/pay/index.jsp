<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main</title>
<!-- 引入样式 -->
<link rel="stylesheet"
	href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">

</head>
<body>

	欢迎使用 人事管理系统！<br>
	<a href="http://localhost:8080/epms-web/pay/pay/index.html">用户管理</a ><br>



</body>
<!-- import Vue before Element -->
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- import JavaScript -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
	new Vue({
		el : '#app',
		data : function() {
			return {
				visible : false
			}
		}
	})
</script>
</html>