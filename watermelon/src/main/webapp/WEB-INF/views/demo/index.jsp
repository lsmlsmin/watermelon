<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
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
