<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
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
        box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
        text-align: center;
    }

    .login-container h2 {
        color: #333333;
        font-size: 22px;
        margin-bottom: 20px;
    }

    .error-message {
        color: #D32F2F;
        font-size: 14px;
        margin-bottom: 15px;
        font-weight: bold;
    }

    table {
        width: 100%;
    }

    td {
        padding: 10px;
        font-size: 14px;
        color: #333333;
    }

    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 8px;
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
        <h2>Customer Login</h2>
        <p class="error-message">Invalid Password</p>
        <form action="/Car-service-system/CutomerLogin">
            <table>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username" required /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" required /></td>
                </tr>
            </table>
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>
