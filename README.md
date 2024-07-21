📚 JDBC in Java

➡️Why is ODBC not used in Java Applications?
 ●ODBC API is written in C Language with pointers.
 ● But Java applications do not contain pointers, so the java code is being converted t pointers code internally which is time-consuming and poor in performance
 ●ODBC is platform-dependent & database independent. In order to overcome this problem, Sun Microsystems introduced the JDBC technology to make the java programs platform and database independent
 ● JDBC is a Java API which offers a natural Java interface for working with SQL.

➡️What is JDBC
 ● JDBC is an API or channel with which we can connect Java applications to various databases.
 ● It is a java API that accesses the data from various kinds of relational databases
 ● It works with java on various kind of platforms like window, linux,Macos etc
 ● JDBC is a java API to connect and execute the query with the databse
 ● JDBC API uses JDBC drivers to connect with the database.

➡️JDBC Architecture
 ● JDBC API : It provides various methods and interfaces for easy communication with the database.
 ● JDBC Drive Manager : It loads database-specific driver in an application to establish a connection with a database.
 ● JDBC Driver: To communicate with a data source through JDBC, you need a JDBC driver that intelligently communicates with the respective data source
 
