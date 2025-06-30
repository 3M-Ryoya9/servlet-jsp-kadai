<%@ page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>Servlet/JSPの課題</title>
	</head>
	<body>
		<a href="<%= request.getContextPath() %>/Link?name=侍太郎">名前「侍太郎」をServletに送信</a>
		<%if(request.getAttribute("Name") != null) { %>
			<h4>Servletからデータを受信しました：<%= request.getAttribute("Name") %>さん、こんにちは！</h4>
		<!-- javaはその文を都度<％％>にいれなきゃダメ -->
		<% } %>
	</body>
</html>