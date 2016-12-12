<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수정페이지</h1>
	<form method="POST" action="./">
	<input name="_method" type="hidden" value="PUT">
	<table>
		<tr>
			<td>
				<label for="sabun">sabun</label>
			</td>
			<td>
				<input type="text" name="sabun" id="sabun" value="${bean.sabun }"/>
			</td>
		</tr>
		<tr>
			<td>
				<label for="name">name</label>
			</td>
			<td>
				<input type="text" name="name" id="name" value="${bean.name }"/>
			</td>
		</tr>
		<tr>
			<td>
				<label for="pay">pay</label>
			</td>
			<td>
				<input type="text" name="pay" id="pay" value="${bean.pay }"/>
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







