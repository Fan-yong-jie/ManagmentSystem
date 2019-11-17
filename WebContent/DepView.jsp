
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>部门管理</title>
<body>
	<br>
	<form name="f2" method="post" action="DepCont" id="emp">
		<table border="2" width="58%" align="center" cellpadding="6">
			<tr bgcolor="#00CCFF">
				<td width="16%" align="center" colspan="4"><B>部门管理</B></td>
			</tr>
			<tr>
				<td width="15%"><lable>部门编号</lable></td>
				<td width="35%"><input type="text" name="depno" value="${aa}"></td>
				<td width="15%">部门名称</td>
				<td width="35%"><input type="text" name="depname" value="${bb}"></td>
			</tr>

			<tr>
				<td width="15%"><lable>部门人数</lable></td>
				<td width="35%"><input type="text" name="cmmt" value="${cc}"></td>

			</tr>
			<tr>
				<td width="15%" align="center" colspan="4"><input type="button"
					value="增加" onclick="Aa(0)">&nbsp;&nbsp; <input
					type="button" value="修改" onclick="Aa(1)">&nbsp;&nbsp; <input
					type="button" value="删除" onclick="Aa(2)">&nbsp;&nbsp; <input
					type="button" value="查找" onclick="Aa(3)">&nbsp;&nbsp;</td>
			</tr>

		</table>
		<input type="text" name="judge" id="judge" style="display: none"><br>

	</form>
	<script type="text/javascript">          
switch(${dd}){
      case 0:alert("编号已存在");break;
       case 1:alert("添加成功");break;
       case 2:alert("修改成功");break;
       case 3:alert("删除成功");break;
             }           
</script>
</body>
<script>
    function Aa(number) {
    	document.getElementById("judge").value=number;
    	document.getElementById("emp").submit();

	}
   </script>
</head>
</html>