<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>欢迎注册</title>
<style>
/*去除空隙*/
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

#reg_header {
	margin-top: 20px;
	/* background-color: #fef2f2;*/
	height: 60px;
}

h3 {
	float: left;
	margin-left: 150px;
}

.reg_h_right {
	float: right;
	display: inline-block;
	margin-right: 280px;
}

.main_left {
	width: 500px;
	/* background-color: aqua;*/
	margin: 0 auto;
	height: 250px;
}

#form-itemGroup {
	width: 340px;
	height: 40px; /*高度为40*/
	margin-top: 20px;
	border: 1px #ccc solid;
	padding-left: 10px;
	padding-top: 8px;
}

#form-itemGroup input {
	border: none;
	height: 20px;
}

.submit_button {
	width: 340px;
	height: 40px; /*高度为40*/
	margin-top: 20px;
}

#button {
	background-color: #ff4400;
	height: 40px;
	width: 340px;
}
</style>
</head>

<body>

	<!--注册头部-->
	<div id="reg_header">

		<h3>欢迎注册</h3>
		<div class="reg_h_right">
			<span style="font-size: 13px">已有账户</span><a href="LoginView.jsp"
				style="font-size: 13px"> 请登录</a>
		</div>

	</div>
	<!--注册主体-->
	<div id="reg_main">
		<div class="main_left">
			<form action="RegisterCont" method="post">
				<div id="form-itemGroup">
					<label for="username">用户名</label> <input id="username"
						name="username" type="text" onblur="checkUserName()"
						oninput="checkUserName()" placeholder="请输入用户名..."> <span
						class="default" id="nameErr" style="font-size: 12px; color: red">请输入6-12位的用户名</span>
				</div>
				<div id="form-itemGroup">
					<label for="userPasword">密码</label> <input id="userPasword"
						name="password" type="password" onBlur="checkPassword()"
						oninput="checkPassword()" placeholder="请输入密码.."> <span
						class="default" id="passwordErr"
						style="font-size: 12px; color: red">请输入8到16位的密码</span>
				</div>
				<div id="form-itemGroup">
					<label for="userConfirmPasword">确认密码</label> <input type="password"
						id="userConfirmPasword" onBlur="ConfirmPassword()"
						oninput="ConfirmPassword()" placeholder="请再次输入密码..."> <span
						class="default" id="conPasswordErr"
						style="font-size: 12px; color: red"></span>
				</div>

				<div class="submit_button">
					<input type="submit" value="立即注册" id="button" onclick="cg()">
				</div>
			</form>
		</div>

	</div>

	<script type="text/javascript">
    //验证用户名
    function checkUserName() {
        var username2 = document.getElementById('username');
        var errname = document.getElementById('nameErr');
        var pattern = /^\w{6,12}$/; //用户名格式正则表达式：用户名要求6-20位
        if (username2.value.length == 0) {
            errname.innerHTML = "用户名不能为空"
            errname.className = "error"
            return false;
        }
        if (!pattern.test(username2.value)) {
            errname.innerHTML = "用户名不合规范"
            errname.className = "error"
            return false;
        } else {
            errname.innerHTML = "OK"
            errname.className = "success";
            return true;
        }
    }
    //验证密码
    function checkPassword() {
        var userpasswd = document.getElementById('userPasword');
        var errPasswd = document.getElementById('passwordErr');
        var pattern = /^\w{8,16}$/; //密码要在8-16位
        if (!pattern.test(userpasswd.value)) {
            errPasswd.innerHTML = "密码不合规范"
            errPasswd.className = "error"
            return false;
        } else {
            errPasswd.innerHTML = "OK"
            errPasswd.className = "success";
            return true;
        }
    }
    //确认密码
    function ConfirmPassword() {
        var userpasswd = document.getElementById('userPasword');
        var userConPassword = document.getElementById('userConfirmPasword');
        var errConPasswd = document.getElementById('conPasswordErr');
        if ((userpasswd.value) != (userConPassword.value)
            || userConPassword.value.length == 0) {
            errConPasswd.innerHTML = "上下密码不一致"
            errConPasswd.className = "error"
            return false;
        } else {
            errConPasswd.innerHTML = "OK"
            errConPasswd.className = "success";
            return true;
        }
    }
    function cg()
    {
    	alert("注册成功！");
    }
</script>
</body>
</html>