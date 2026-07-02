<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
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

    .login-container {
        width: 320px;
        padding: 20px;
        background-color: #ffffff;
        box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.2);
        border-radius: 8px;
        text-align: center;
    }

    .login-container h2 {
        margin-top: 0;
        color: #333333;
    }

    .error-message {
        color: red;
        font-size: 14px;
        margin-bottom: 15px;
    }

    table {
        width: 100%;
        margin-top: 10px;
    }

    td {
        padding: 10px;
        font-size: 14px;
        color: #333333;
    }

    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        border: 1px solid #cccccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 4px;
        font-weight: bold;
        cursor: pointer;
        transition: background-color 0.3s ease;
        margin-top: 15px;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
<div class="login-container">
    <h2>Admin Login</h2>
    <p class="error-message">INVALID USERNAME</p>
    <form action="/Car-service-system/AdminLogin">
        <table>
            <tr>
                <td>Username</td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" /></td>
            </tr>
        </table>
        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>
