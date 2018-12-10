# DsProject

## Project Specification 
As part of my fourth year Distributed Systme project I was required to use the JAX-RS/Jersey, Java RMI and JAXB frameworks to develop a simple Car Hire
Booking System. A Web Client page should provide users with the ability to Create/Modify/Update/Delete
bookings for a specific vehicle for a given set of dates. The Web Client will interact with a RESTful JAX-RS
Web Service for bookings which is deployed on Apache Tomcat Server. The RESTful Web Service will act as
a RMI client to a RMI Database Server which will handle persistence.

## Run Project 
-Clone or download the project to your workspace  
-Launch Eclispe   
-File > import project   
-When project is imported add tomcat server  
-Then run Database-Service as a java application and choose RMISETUP  
-Then run Client on the server  

## Project Features
Project will display all customers from database  
Project will display vechicles from database  
Project will not display Bookings (I believe this is down to my SQL code and not the Java Code)  
Project will not show visual update or delete or post on screen  
I was unable to meet full critera for this project.   


## References Used 
[H2 Tutorial](http://www.h2database.com/html/tutorial.html)  
[Java Code Examples for javax.ws.rs.core.MediaType.APPLICATION_JSON](https://www.programcreek.com/java-api-examples/?class=javax.ws.rs.core.MediaType&method=APPLICATION_JSON)  
[REST with Java (JAX-RS) using Jersey - Tutorial](http://www.vogella.com/tutorials/REST/article.html)  
[JAX-RS Tutorial](https://www.javatpoint.com/jax-rs-tutorial)
