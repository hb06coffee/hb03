<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입력페이지</h1>
	<form action="./" method="post">
	<table>
		<tr>
			<td>
				<label for="sabun">sabun</label>
			</td>
			<td>
				<input type="text" name="sabun" id="sabun"/>
			</td>
		</tr>
		<tr>
			<td>
				<label for="name">name</label>
			</td>
			<td>
				<input type="text" name="name" id="name"/>
			</td>
		</tr>
		<tr>
			<td>
				<label for="pay">pay</label>
			</td>
			<td>
				<input type="text" name="pay" id="pay"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<button type="submit">submit</button>
				<button type="reset">reset</button>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>







