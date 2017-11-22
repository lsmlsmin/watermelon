<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!doctype html>
<html lang="en">
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>Home</title>
</head>
<body>
<h1>
	Index Page
</h1>

<ul>
<c:forEach var="item" items="${list }" varStatus="status">
	<li>${item.seqno } / ${item.name }</li>
</c:forEach>
</ul>

</body>
</html>
