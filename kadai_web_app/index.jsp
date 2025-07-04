<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Servlet/JSPの基礎を学ぼう</title>
</head>

<body>
	<h2>webアプリへようこそ！</h2>
	<a href="<%= request.getContextPath() %>/form">個人情報入力フォーム</a>
</body>
</html>