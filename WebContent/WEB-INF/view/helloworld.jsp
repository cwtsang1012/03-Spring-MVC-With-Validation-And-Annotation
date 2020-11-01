<!DOCTYPE html>
<html>

<head>
	<link rel="stylesheet" type="text/css"          
            href="${pageContext.request.contextPath}/css/my-test.css">
    <script src="${pageContext.request.contextPath}/js/simple-test.js"></script>
</head>

<body onLoad="test()">
<h2>Hello World of Spring!</h2>
Student Name: ${param.studentName}
<br><br>
The message: ${message}
<br><br>
<img src="${pageContext.request.contextPath}/images/pop.jpg" />

</body>

</html>