<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"
     import="java.util.* , com.lifemichael.javaee.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id = "con" scope="session" class="com.lifemichael.javaee.model.Contact"/>
<jsp:setProperty property="*" name="con"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1255">
<title>Cheers</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href="../css/myCustomCss.css">
 		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
 		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</head>
<body>

<a href="menu">ToDoList<span class="glyphicon glyphicon-home"></span></a>

<div class="alert alert-info">
  	<strong>Info:</strong> 
	<br>
	<!-- DISPLAY USER IFORMATION ABOUT THE ACTION HE PERFORMED -->
	Name: <jsp:getProperty property="name" name="con"/><br>
	E-mail: <jsp:getProperty property="email" name="con"/><br>
	Feedback: <jsp:getProperty property="comment" name="con"/><br>
	
</div>

</body>
</html>