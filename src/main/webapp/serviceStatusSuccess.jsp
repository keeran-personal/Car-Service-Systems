<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Service Status</title>
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
    .status-container {
        padding: 30px;
        background-color: #ffffff;
        box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
        text-align: center;
        width: 350px;
    }
    .status-container h2 {
        color: #333333;
        font-size: 22px;
        margin-bottom: 20px;
    }
    .status-container p {
        color: #333333;
        font-size: 18px;
    }
    .status-container .status {
        font-weight: bold;
        font-size: 20px;
        color: #4CAF50;
    }
</style>
</head>
<body>
    <div class="status-container">
        <h2>Service Status</h2>
        <% 
            String status = (String) session.getAttribute("sStatus");
            if (status != null) {
        %>
            <p>Your service status is: <span class="status"><%= status %></span></p>
        <% 
            } else {
        %>
            <p>Your service status is not available at the moment. Please try again later.</p>
        <% 
            }
        %>
    </div>
</body>
</html>
