# Docker Assignment – Full Stack Employee Management Application

## Overview

This repository demonstrates the containerization and deployment of a full-stack Employee Management Application using Docker and Docker Compose.

The project consists of:

* React Frontend (Vite)
* Spring Boot Backend
* MySQL Database
* Docker & Docker Compose
* Nginx for Frontend Serving

The application allows users to perform employee management operations through a web interface while the backend provides REST APIs connected to a MySQL database.

---

## Architecture

```text
┌─────────────┐
│   React UI  │
│   (Vite)    │
└──────┬──────┘
       │
       ▼
┌─────────────┐
│ Spring Boot │
│ REST APIs   │
└──────┬──────┘
       │
       ▼
┌─────────────┐
│   MySQL DB  │
└─────────────┘
```

All services are containerized and can be started together using Docker Compose.

---

## Technologies Used

### Frontend

* React
* Vite
* JavaScript (JSX)
* Axios
* Nginx
* Docker

### Backend

* Java 17
* Spring Boot
* Maven
* MySQL
* Docker

### DevOps

* Docker
* Docker Compose
* Docker Hub

---

## Features

### Frontend

* View all employees
* Add new employees
* Delete employees
* Responsive UI
* API integration with backend services

### Backend

* Employee CRUD APIs
* Health Check Endpoint
* MySQL Database Integration
* RESTful Architecture

### Docker

* Dockerized Frontend
* Dockerized Backend
* MySQL Container
* Multi-container orchestration with Docker Compose
* Docker Hub image publishing

---

## Repository Structure

```text
docker-assignment/
│
├── employee-frontend/
│   ├── src/
│   ├── Dockerfile
│   ├── docker-compose.yml
│   └── README.md
│
├── springboot-crud-app/
│   ├── src/
│   ├── Dockerfile
│   ├── docker-compose.yml
│   └── README.md
│
├── docs/
│   └── screenshots/
│
└── README.md
```

---

## Docker Images

### Backend

```text
gauri1498/dockerbasic-springbootcrud:v3
```

### Frontend

```text
gauri1498/employee-frontend:v1
```

---

## Running the Application

### Clone Repository

```bash
git clone <repository-url>
cd docker-assignment
```

### Build and Start Containers

```bash
docker compose up --build
```

### Run in Detached Mode

```bash
docker compose up -d
```

### Stop Containers

```bash
docker compose down
```

---

## Application URLs

### Frontend

```text
http://localhost:3000
```

### Backend

```text
http://localhost:8080
```

### Health Check

```text
http://localhost:8080/health
```

---

## API Endpoints

| Method | Endpoint        | Description        |
| ------ | --------------- | ------------------ |
| GET    | /health         | Health Check       |
| GET    | /employees      | Get All Employees  |
| GET    | /employees/{id} | Get Employee By ID |
| POST   | /employees      | Create Employee    |
| PUT    | /employees/{id} | Update Employee    |
| DELETE | /employees/{id} | Delete Employee    |

---

## Learning Objectives

This assignment demonstrates:

* Docker Fundamentals
* Creating Docker Images
* Multi-Stage Docker Builds
* Docker Compose
* Container Networking
* Environment Configuration
* Full Stack Containerization
* Docker Hub Integration
* Frontend-Backend Communication

---

## Screenshots

Project screenshots and documentation can be found in the `docs` folder.

---

## Author

**Gauri Dhadhiya**

Full Stack Docker Assignment demonstrating containerization of React, Spring Boot, and MySQL applications using Docker and Docker Compose.
