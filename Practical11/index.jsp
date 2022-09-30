<%-- 
    Document   : index
    Created on : Sep 23, 2022, 1:48:39 PM
    Author     : Administrator
    Write a servlet program to accept login details from html form and check 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogIn Page</title>
    </head>
    <body bgcolor="cyan">
        <h1>LOGIN FORM</h1>
        <form method ="post" action ="LoginForm">
            User Name:<input type="text" name="txt1">
            <br>
            Password:<input type="password" name="txt2">
            <br>
            <input type="submit" value="Submit">
                            
        </form>
    </body>
</html>