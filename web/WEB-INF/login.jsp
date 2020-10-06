<%-- 
    Document   : login
    Created on : Oct 5, 2020, 9:59:17 PM
    Author     : 815000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1><br>
        <form method="post" action="login">
            <b>Username: </b><input type="text" name="username" value="${username}"><br>
            <b>Password:</b><input type="password" name="password" value="${password}"><br>
            <input type="submit" value="Log In">
        </form>
        <p>${msgerror}</p>
    </body>
</html>
