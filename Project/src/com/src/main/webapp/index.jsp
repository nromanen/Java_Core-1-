
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
   
     <html>
     <body>

<H1> Action
</H1>
   
   <p/>
    <a href = " <c:url value = "addAnimal.jsp"/>"> Add Animal</a>
   
 <p/>
    <a href = " <c:url value = "AllAnimalsController"/>"> View All Animal</a> 
    
    <p/>
    
    <form name = "DelEmpty" action = "AllAnimalsController" method = "POST" >
 <input type = "submit" value = "Delete empty records">   
    </form>
    
    
    
     </body>
     </html>