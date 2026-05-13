# 🏥 Hospital Management System (Spring Boot + JWT)

> ⚠️ **Note:**  
> The complete source code for this project is available in the `dev` branch.  
> The `main` branch contains only project overview, architecture details, and documentation.

---

# 📖 Project Overview

The **Hospital Management System** is a backend application developed using **Spring Boot** and **JWT Authentication**.  
This project focuses on implementing secure REST APIs, authentication mechanisms, and backend development best practices in a simple and practical healthcare management scenario.

The application is designed primarily for:
- Learning purposes
- Academic projects
- Backend practice
- Viva demonstrations
- JWT authentication understanding

> 📌 This is a mini-project intended for educational purposes and not a full-scale hospital ERP solution.

---

# 🎯 Project Objectives

The major goals of this project are:

- Implement JWT-based Authentication & Authorization
- Secure REST APIs using Spring Security
- Perform CRUD operations on patient records
- Follow clean backend architecture practices
- Demonstrate Spring Boot project structuring

---

# 🚀 Key Features

✅ User Registration & Login  
✅ JWT Token Generation & Validation  
✅ Secure REST APIs  
✅ Patient Management CRUD Operations  
✅ Password Encryption using Spring Security  
✅ Layered Backend Architecture  
✅ MySQL Database Integration  
✅ Clean & Modular Code Structure  

---

# 🛠️ Technologies Used

- ☕ Java
- 🌱 Spring Boot
- 🔗 Spring Web
- 🔒 Spring Security
- 🪪 JWT (JSON Web Token)
- 🗄️ Spring Data JPA
- 🐬 MySQL
- 🔹 Lombok
- 📦 Maven
- 📬 Postman (API Testing)

---

# 📂 Project Structure

```text
hospital-management-system/
├── config/
├── controller/
├── dto/
├── entity/
├── repository/
├── service/
└── HospitalManagementApplication.java
```

---

# 🔐 Authentication Module

The Authentication Module handles:

- User Registration
- User Login
- JWT Token Generation
- JWT Validation
- API Security Configuration

---

# 🩺 Patient Management Module

The Patient Module supports:

- Add Patient
- View All Patients
- Get Patient by ID
- Update Patient Details
- Delete Patient Records

---

# 🔄 Authentication Flow

The JWT authentication workflow follows these steps:

1️⃣ User registers using name, email, and password  
2️⃣ Password gets encrypted before storage  
3️⃣ User logs in with credentials  
4️⃣ JWT token is generated upon successful login  
5️⃣ Token is used to access secured endpoints  

---

# 🌐 REST API Endpoints

## 🔑 Authentication APIs

### Register User

```http
POST /api/auth/register
```

---

### Login User

```http
POST /api/auth/login
```

---

# 🏥 Patient APIs (Secured)

### Add Patient

```http
POST /api/patients
```

### Get All Patients

```http
GET /api/patients
```

### Get Patient By ID

```http
GET /api/patients/{id}
```

### Update Patient

```http
PUT /api/patients/{id}
```

### Delete Patient

```http
DELETE /api/patients/{id}
```

---

# 🔑 Authorization Header

To access protected APIs, include the JWT token in the request header:

```http
Authorization: Bearer <your_token>
```

---

# 🗄️ Database Design

## 👤 Users Table

| Column |
|--------|
| id |
| name |
| email |
| password |
| role |

---

## 🩺 Patients Table

| Column |
|--------|
| id |
| name |
| age |
| gender |
| disease |
| address |
| phone_number |

---

# ⚙️ Application Configuration

## `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080

jwt.secret=your_secret_key
jwt.expiration=86400000
```

---

# ▶️ Running the Application

## Step 1 — Clone the Repository

```bash
git clone <repository-url>
```

---

## Step 2 — Navigate to Project Folder

```bash
cd hospital-management-system
```

---

## Step 3 — Configure MySQL Database

Update database credentials inside:

```text
application.properties
```

---

## Step 4 — Run the Application

```bash
mvn spring-boot:run
```

Application starts on:

```text
Tomcat started on port 8080
```

---

# 🧪 API Testing

You can test APIs using:

- 📬 Postman
- Swagger (future enhancement)
- REST Client Extensions

---

# ✨ Functional Highlights

- JWT Authentication
- Secure API Access
- CRUD Operations
- Clean Project Architecture
- Modular Backend Design
- Easy-to-Understand Codebase

---

# ⚠️ Current Limitations

This mini-project currently does not include:

- Frontend Integration
- Doctor Management Module
- Appointment Scheduling
- Advanced Role-Based Access Control
- Billing & Reports

---

# 📈 Future Enhancements

Planned improvements for future versions:

- 👨‍⚕️ Doctor Management Module
- 📅 Appointment Scheduling System
- 🔐 Role-Based Access Control (RBAC)
- 🌐 Frontend using React / Angular
- 🔍 Pagination & Search
- 📘 Swagger API Documentation
- 📊 Dashboard & Analytics

---

# 📚 Learning Outcomes

This project helps in understanding:

- Spring Boot Backend Development
- JWT Authentication & Security
- REST API Design
- CRUD Operations
- Spring Security Configuration
- Layered Architecture
- MySQL Integration
- Clean Coding Practices

---

# 👨‍💻 Developer

**Developed by Kavish**

This project was created for educational purposes to practice Spring Boot backend development, authentication mechanisms, and secure API implementation.

---

# 📜 License

This project is intended for learning, academic, and demonstration purposes only.

```
