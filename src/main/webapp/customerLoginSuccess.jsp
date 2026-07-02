<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Login Success</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f9;
        color: #333;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .container {
        background-color: #fff;
        padding: 20px 30px;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        text-align: center;
        max-width: 400px;
        width: 100%;
    }
    h1 {
        font-size: 24px;
        color: #4CAF50;
    }
    p {
        font-size: 16px;
        margin: 10px 0;
    }
    a {
        display: block;
        margin: 10px 0;
        padding: 10px;
        color: #fff;
        text-decoration: none;
        background-color: #007BFF;
        border-radius: 5px;
        transition: background-color 0.3s ease;
    }
    a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<div class="container">
    <h1>Login Success</h1>
    <p>
        <% out.println("Dear " + session.getAttribute("username") + ", your login was successful!"); %>
    </p>
    <a href="carDetails.html">Enter your Car details</a>
    <a href="#">Edit your Car details</a>
    <a href="serviceRequest.html">Request a service</a>
    <a href="serviceStatus.html">Service status</a>
</div>
</body>
</html>
