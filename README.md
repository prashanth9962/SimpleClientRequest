SimpleClientRequest
===================

SimpleClient Request reads the browser hits from the servlet http://localhost:9876/SimpleClientRequest/RequestServlet
and records browser data into the Cassandra database(keyspace browser,table browserdata)


Server Tomcat7
DB Cassandra 2.0.5
Datastax java driver-2
Create Keyspace named Browser
uncomment the create table for the time alone in RequestConnect.java
Run http://localhost:9876/SimpleClientRequest/RequestServlet
The Browser name and time of the visit will be recorded into the database


