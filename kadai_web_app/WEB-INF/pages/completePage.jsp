<%@ page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		 <title>Servlet/JSPの基礎を学ぼう</title>
	</head>
	<body>
		<h2>個人情報入力が完了しました。</h2>
		
		<%-- 戻るボタン(入力フォームに戻る) --%>
		<%-- location.hrefはURLを代入することでページ遷移を行う --%>
		<%-- TMLの属性の中で <%= %> を使うときは、ダブルクォーテーション " の中に書く必要があるから、
		     Javaの文字列側はシングルクォーテーション ' を使うのが基本 --%>
		<button onclick="location.href='<%= request.getContextPath() %>/form';">戻る</button>
	</body>
</html>