<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Todo Items</title>
</head>
<body>
    <div align="center">
        <table border="1" cellpadding="5">

            <caption><h2>Equipes</h2></caption>

            <tr>
                <th>Title</th>
            </tr>

            <c:forEach var="item" items="${championnat.equipes}">
                <tr>
                    <td><c:out value="${item.nom}"/></td>
            </c:forEach>
        </table>
    </div>

</body>
</html>