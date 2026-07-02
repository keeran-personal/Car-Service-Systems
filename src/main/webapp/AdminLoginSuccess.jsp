<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f3f4f6;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .success-container {
        width: 300px;
        padding: 20px;
        background-color: #ffffff;
        box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.2);
        border-radius: 8px;
        text-align: center;
    }

    .success-container h2 {
        color: #4CAF50;
        font-size: 18px;
        margin: 0 0 15px 0;
    }

    .success-container a {
        display: inline-block;
        padding: 10px 20px;
        margin-top: 10px;
        background-color: #4CAF50;
        color: white;
        text-decoration: none;
        border-radius: 4px;
        transition: background-color 0.3s ease;
    }

    .success-container a:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
<div class="success-container">
    <h2>Login Success</h2>
    <a href="ViewCars">View Car Details</a>
</div>
</body>
</html>
