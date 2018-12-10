<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Booking Service</title>
</head>

<body>
	
	<form action= "Cx" method="get">
		<input type="submit" value="Get All Customers" style="height:30px;width:200px"/>
	</form>
	<form action= "Vehicles" method="get">
		<input type="submit" value="Get All Vehicles" style="height:30px;width:200px"/>
	</form>
	<form action= "Bookings" method="get">
		<input type="submit" value="Get All Bookings" style="height:30px;width:200px"/>
	</form>
	
	<br/>
	
	<form action= "Bookings" method="post">
		<br/> Name <br/>
		<input type="text" name="firstName" style="height:30px;width:200px"/>
		<br/> Address <br/>
		<input type="text" name="address" style="height:30px;width:200px"/>
		<br/> Make <br/>
		<input type="date" name="make" style="height:30px;width:200px"/>
		<br/> Model <br/>
		<input type="date" name="model" style="height:30px;width:200px"/>
		<br/><br/>
		<input type="submit" value="Make Booking" style="height:30px;width:200px"/>
	</form>
	
</body>
</html>