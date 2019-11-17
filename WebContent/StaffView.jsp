<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>员工管理</title>
</head>
<body>
	<br>
	<form name="f2" method="post" action="StaffCont" id="f2">
		<table border="2" width="58%" align="center" cellpadding="6">
			<tr bgcolor="#00CCFF">
				<td width="16%" align="center" colspan="4"><B>员工管理</B></td>
			</tr>
			<tr>
				<td width="15%"><lable>员工编号</lable></td>
				<td width="35%"><input type="text" name="id" value="${id}"></td>
				<td width="15%">员工名称</td>
				<td width="35%"><input type="text" name="name" value="${name}"></td>
			</tr>
			<tr>
				<td width="15%"><lable>年龄</lable></td>
				<td width="35%"><input type="text" name="age" value="${age}"></td>
				<td width="15%">性别</td>
				<td width="35%">
					<%  
	   
	%> <input type="radio" name="sex" value="男"${sex=="男"?"checked='checked'":""} }>男</input>
					<input type="radio" name="sex" value="女"${sex=="女"?"checked='checked'":""} }>女</input>
				</td>
			</tr>
			<tr>
				<td width="15%"><lable>工资</lable></td>
				<td width="35%"><input type="text" name="cmmt" value="${sal}"></td>
				<td width="15%">所在部门</td>
				<td width="35%"><select name="bm">
						<option ${dep=="销售部"?"selected='selected'":""}>销售部</option>
						<option ${dep=="行政部"?"selected='selected'":""}>行政部</option>
						<option ${dep=="财务部"?"selected='selected'":""}>财务部</option>
						<option ${dep=="技术部"?"selected='selected'":""}>技术部</option>
				</select></td>
			</tr>
			<tr>
				<td width="15%" align="center" colspan="4"><input type="button"
					value="增加" onclick="formDo(0)">&nbsp;&nbsp; <input
					type="button" value="修改" onclick="formDo(1)">&nbsp;&nbsp; <input
					type="button" value="删除" onclick="formDo(2)">&nbsp;&nbsp; <input
					type="button" value="查询" onclick="formDo(3)">&nbsp;&nbsp;</td>
			</tr>
		</table>
		<br> <input type="text" name="yc" id="judge"
			style="display: none">
	</form>

</body>
<script type="text/javascript">
  function formDo(number) {
	document.getElementById("judge").value=number;
	document.getElementById("f2").submit();
	
}
</script>
</html>