
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
   
     <html>
     <body>
     
     <H1>
     Add Animal
     </H1>
     
 <form name = "addAnimal" action = "AnimalController" method = "POST">
Name: <input type = "text" name = "name">
<input type = "submit" value = "Add animal">
</form>     

     </body>
     </html>