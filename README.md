# JDBC in Java

## Why is ODBC not used in Java Applications?
- ODBC API is written in C Language with pointers.
- Java applications do not contain pointers, so the Java code is being converted to pointers code internally which is time-consuming and poor in performance.
- ODBC is platform-dependent and database-independent. In order to overcome this problem, Sun Microsystems introduced the JDBC technology to make the Java programs platform and database independent.
- JDBC is a Java API which offers a natural Java interface for working with SQL.

## What is JDBC
- JDBC is an API or channel with which we can connect Java applications to various databases.
- It is a Java API that accesses the data from various kinds of relational databases.
- It works with Java on various kinds of platforms like Windows, Linux, macOS, etc.
- JDBC is a Java API to connect and execute queries with the database.
- JDBC API uses JDBC drivers to connect with the database.

## JDBC Architecture
- **JDBC API**: It provides various methods and interfaces for easy communication with the database.
- **JDBC Driver Manager**: It loads database-specific drivers in an application to establish a connection with a database.
- **JDBC Driver**: To communicate with a data source through JDBC, you need a JDBC driver that intelligently communicates with the respective data source.
