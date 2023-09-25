


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <head>
        <title>Welcome to App</title>
    </head>

    <body>

        <p>
            Id :${user.userId}
            Name:${user.userName}
            Role:${user.userRole}
        </p>



        <table border=1>

            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Role</th>
            </tr>

            <c:forEach var="user" items="${listObj}">
               
                <tr>
                      <td>${user.userId}</td>
                      <td>${user.userName}</td>
                      <td>${user.userRole}</td>
                </tr>
                
            </c:forEach>

        </table>
    </body>

</html>