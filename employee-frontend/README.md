# Employee Frontend Application

## Overview

This project is a React-based frontend application developed using Vite. It consumes REST APIs exposed by the Spring Boot Employee Management backend application and provides a simple user interface for managing employees.

Tech Stack

* React
* Vite
* JavaScript (JSX)
* Axios
* Docker
* Docker Compose
* Nginx (for production container)

## Features

* View all employees
* Add a new employee
* Delete an employee
* Integration with Spring Boot REST APIs
* Dockerized frontend application

## Backend API

The frontend consumes the following backend APIs:

### Get All Employees

```http
GET /employees
```

### Create Employee

```http
POST /employees
```

Request Body:

```json
{
  "name": "Gauri",
  "department": "IT",
  "salary": 50000
}
```

### Delete Employee

```http
DELETE /employees/{id}
```

## Project Setup

### Install Dependencies

```bash
npm install
```

### Run Application Locally

```bash
npm run dev
```

Application URL:

```text
http://localhost:5173
```

## Build Production Bundle

```bash
npm run build
```

## Docker Support

### Build Docker Image

```bash
docker build -t gauri1498/employee-frontend:v1 .
```

### Run Docker Container

```bash
docker run -p 3000:80 gauri1498/employee-frontend:v1
```

Application URL:

```text
http://localhost:3000
```

## Docker Compose

### Run Using Docker Compose

```bash
docker compose up
```

### Stop Containers

```bash
docker compose down
```

## Docker Hub Repository

Docker Image:

```text
gauri1498/employee-frontend:v1
```

## Project Structure

```text
employee-frontend
│
├── public
├── src
│   ├── App.jsx
│   ├── api.js
│   ├── App.css
│   └── main.jsx
│
├── Dockerfile
├── docker-compose.yml
├── package.json
├── vite.config.js
└── README.md
```

## Author

Gauri Dhadhiya
