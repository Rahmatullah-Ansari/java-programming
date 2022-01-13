<%%@page contentType="text/html" pageEncoding="UTF-8"%%>
<!DOCTYPE html>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>JSP Page</title>

</head>

<body>

<h1>Addition Of Two Number </h1>

<%%>

<%%

int sum,a,b;

String f1 = request.getParameter("first"); String f2 = request.getParameter("second"); a = Integer.parseInt(f1);
b = Integer.parseInt(f2); sum = a+b;
%%>

<font color =" gray" size="5">

<%%

out.println("Addition of Two Number is ="+sum);

%%>

</font>

</body>

</html>