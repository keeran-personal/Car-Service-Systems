<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Failure</title>
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

    .message-container {
        padding: 30px;
        background-color: #ffffff;
        box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
        text-align: center;
        width: 350px;
    }

    .message-container h1 {
        color: #D32F2F; /* Red color for failure message */
        font-size: 36px;
        margin: 0;
    }

    .message-container p {
        color: #333333;
        font-size: 18px;
        margin-top: 20px;
    }

    .button {
        display: inline-block;
        padding: 10px 20px;
        background-color: #4CAF50;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        margin-top: 20px;
    }

    .button:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
    <div class="message-container">
        <h1>Failure</h1>
        <p>There was an issue processing your request. Please try again later.</p>
        <a href="/" class="button">Go Back</a>
    </div>
</body>
</html>
