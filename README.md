# <p align="center"><a href="#" target="_blank"><img src="https://i1.wp.com/itvsme.com/blog/wp-content/uploads/2019/10/ezgif.com-webp-to-png.png?fit=700%2C400&ssl=1"></a></p>

# spring-boot-rest-api
This project shows how to use spring boot rest api and storing the responses to the database.

# Guide.
- For better understanding download the project and follow the steps.

## Tools
- Tools to use *(optional)* [SoapUI](https://www.soapui.org/), [Swagger](https://swagger.io/) or [Postman](https://www.getpostman.com/)

## Step 1.
- After downloading the project create a database name called *api* and set the database *username* and *password* in the file *application.properties* in the *resource folder*
- Run the project. This will start the project at *http://localhost:8080/*

## Step 2 (Adding new user).
- Make a *post* request to *http://localhost:8080/api/v1* with the following params

```bash
   http://localhost:8080/api/v1
   
   params name,email and phoneNumber
```
## Step 3 (Fetching Single Record)
- Make a *get* request to *http://localhost:8080/api/v1/{id}* with the following params

```bash
   http://localhost:8080/api/v1
   
   params id
```
## Step 4 (Deleting Single Record)
- Make a *delete* request to *http://localhost:8080/api/v1* with the following params

```bash
   http://localhost:8080/api/v1
   
   params id
```
## Step 5 (Fetching All Records)
- Make a *get* request to *http://localhost:8080/api/v1/all* .

```bash
   http://localhost:8080/api/v1/all
```
## Step 6 (Update new user).
- Make a *patch* request to *http://localhost:8080/api/v1* with the following params

```bash
   http://localhost:8080/api/v1
   
   params id,name,email and phoneNumber
```

#### Hope You Understood the flow. *O_o*