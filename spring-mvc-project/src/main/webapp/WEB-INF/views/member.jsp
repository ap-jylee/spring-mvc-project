<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>find all</h1>
	<c:forEach items="${members}" var="member">
		<h2>${member.id} / ${member.password}</h2>
	</c:forEach>
	<h1>find one</h1>
	<h3>${member.id} / ${member.password}</h3>
</body>
</html>
