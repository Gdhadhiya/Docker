# Spring Boot Docker CRUD Application

## Overview

This project demonstrates containerization of a Spring Boot CRUD application using Docker and Docker Compose with MySQL integration.

## Tech Stack

- Java 17
- Spring Boot
- MySQL
- Docker
- Docker Compose
- Maven

## Features

- CRUD APIs
- Health Check API
- MySQL Database Integration
- Dockerized Application
- Multi-container setup using Docker Compose

## API Endpoints

### Health Check

GET

```text
/health
```

### Create Employee

POST

```text
/employees
```
### Body

```json
{
  "name": "Gauri",
  "department": "IT",
  "salary": 50000
}
```

### Get All Employees

GET

```text
/employees
```

### Get Employee By ID

GET

```text
/employees/{id}
```

### Update Employee

PUT

```text
/employees/{id}
```

### Delete Employee

DELETE

```text
/employees/{id}
```

## Run Project

### Build Project

```bash
mvn clean package   
OR inside powershel inside project folder path run 
.\mvnw.cmd clean package
```

### Run using Docker Compose

```bash
docker compose up --build

docker compose up -d
```
### to shut down compose
```bash
docker compose down
```

## Docker Commands

### List Containers

```bash
docker ps        //running containers only 
docker ps -a    // gives all containers 
```

### Stop Containers

```bash
docker compose down
```

## Docker Hub

Image Link:

```text
gauri1498/dockerbasic-springbootcrud:v3
```
## Docker Image

Docker Hub Repository:
https://hub.docker.com/repository/docker/gauri1498/dockerbasic-springbootcrud

### Pull Image
```bash
docker pull gauri1498/dockerbasic-springbootcrud:v3
```
### Run Container 
```bash
docker run -p 8080:8080 gauri1498/dockerbasic-springbootcrud:v3
```

##  Project Screenshots

👉 View full screenshots document:  
[View PDF](./docs/DockerBasicDocs.pdf)


## Author

Gauri Dhadhiya