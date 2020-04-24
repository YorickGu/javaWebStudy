<%--
  Created by IntelliJ IDEA.
  User: gyj
  Date: 2020/4/25
  Time: 上午 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>一点教程网-使用Servlet上传文件</title>
</head>
<body>
<h1>使用Servlet上传文件</h1>
<form action="Upload" method="post" enctype="multipart/form-data">
    请选择文件:<input type="file" name="fname"/><br/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>