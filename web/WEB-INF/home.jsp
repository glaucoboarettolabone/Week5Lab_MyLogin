<%-- 
    Document   : home
    Created on : Oct 5, 2020, 11:30:50 PM
    Author     : 815000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h2>Hello ${user.username}</h2><br>
        <a href="login?logout=1">Log out</a>
    </body>
</html>
