<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring test App</title>
</head>
<body>
<form:form action="/test_form" method="post" commandName="testUser">
  <label for="user">User:</label><br>
  <input type="text" id="user" name="user" placeholder="Swetha"><br>
  <label for="comments">Comments:</label><br>
  <input type="text" id="comments" name="comments" placeholder="Ramesh"><br><br>
  <input type="submit" value="Submit">
   <label for="rating">Rating:</label><br>
  
  <input type="range" name="rating" id="rating" min="0" max="10" value="5" class="slider">
</form:form> 
</body>
</html>