# <p align="center"><a href="#" target="_blank"><img src="https://i1.wp.com/itvsme.com/blog/wp-content/uploads/2019/10/ezgif.com-webp-to-png.png?fit=700%2C400&ssl=1"></a></p>

# spring-boot-rest-api
This project shows how to use spring boot rest api and storing the responses to the database.

# Guide.
## Step 1.
- After downloading the project create a database name called *api* and set the database *username* and *password* in the file *application.properties* in the *resource folder*
- Run the project. This will start the project at *http://localhost:8080/*

## Tools
- Tools to use *(optional)* SoapAPI or Postman

## Step 2 (Adding new user).
- Make a *post* request to *http://localhost:8080/api/add* with the following params

```bash
   http://localhost:8080/api/add
   
   params name,email and phoneNumber
```
## Step 3 (Fetching Single Record)
- Make a *get* request to *http://localhost:8080/api/fetch* with the following params

```bash
   http://localhost:8080/api/fetch
   
   params id
```
## Step 4 (Deleting Single Record)
- Make a *post* request to *http://localhost:8080/api/destroy* with the following params

```bash
   http://localhost:8080/api/destroy
   
   params id
```
## Step 5 (Fetching All Records)
- Make a *get* request to *http://localhost:8080/api/all* .

```bash
   http://localhost:8080/api/all
```

#### Hope You Understood the flow. *O_o*