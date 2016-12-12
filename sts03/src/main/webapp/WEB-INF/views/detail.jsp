<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세페이지</h1>
	<table>
		<tr>
			<td>사번</td>
			<td>${bean.sabun }</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${bean.name }</td>
		</tr>
		<tr>
			<td>날짜</td>
			<td>${bean.nalja }</td>
		</tr>
		<tr>
			<td>금액</td>
			<td>${bean.pay }</td>
		</tr>
	</table>
	<p><a href="${bean.sabun }/form">수정</a></p>
	<form method="post">
		<input type="hidden" name="_method" value="delete" /> 
		<button>삭제</button>
	</form>
</body>
</html>







