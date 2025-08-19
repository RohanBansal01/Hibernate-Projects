---

# 🐍 Hibernate Projects

![Java](https://img.shields.io/badge/Java-8+-blue.svg)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-green.svg)
![Maven](https://img.shields.io/badge/Maven-Build-orange.svg)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)
![Stars](https://img.shields.io/github/stars/RohanBansal01/Hibernate-Projects?style=social)
![Forks](https://img.shields.io/github/forks/RohanBansal01/Hibernate-Projects?style=social)

---

## 📖 Overview

This repository is a **collection of Hibernate-based mini projects**, each demonstrating **real-world use cases** of ORM (Object Relational Mapping).
Every folder represents a standalone Maven project with its own entities, DAO layer, persistence configuration, and CRUD operations.

The aim is to provide **hands-on Hibernate learning** with practical business problems like **inventory management, employee tracking, student enrollment, hospital records, etc.**

---

## 📂 Projects Included

* 📚 **BookVerse Catalog System** – Manage books (CRUD with Hibernate)
* 👨‍💼 **WorkMate Employee Management** – Employee records management
* 💻 **TechHub Laptop Inventory** – Laptop stock tracking
* 📱 **PhoneWorld Mobile Inventory** – Mobile store CRUD operations
* 🎬 **StreamFlix Movie Collection** – Movie catalog management
* 🏥 **MediCare Patient Records** – Hospital database with Hibernate
* 🏠 **PropConnect Real Estate Listings** – Property listings system
* 🍴 **FoodieHub Restaurant Menu** – Restaurant menu CRUD system
* 💾 **Hibernate Second Level Caching** – Demonstration of caching in ORM
* 🚗 **AutoLux Showroom Management** – Car showroom database
* 🎓 **EduMax Student Enrollment** – Student admission system

---

## 🛠️ Tech Stack

* **Java SE 8+**
* **Hibernate ORM (5.x/6.x)**
* **Maven** (build tool)
* **Database**: MySQL / Oracle (SCOTT schema)
* **IDE**: Eclipse / IntelliJ IDEA

---

## 📂 Project Structure (Generic Company-Style)

Each project follows the **Maven standard layout**:

```
project-name/
│── src/main/java/
│   └── com.companyname.projectname/
│       ├── app/              # Application driver (entry point)
│       │   └── ProjectDriver.java
│       │
│       ├── dao/              # Data Access Layer (CRUD operations)
│       │   └── EntityDao.java
│       │
│       ├── entity/           # Hibernate entity classes
│       │   └── EntityClass.java
│       │
│       └── service/          # Business logic layer
│           └── EntityService.java
│
│── src/main/resources/
│   └── META-INF/
│       └── persistence.xml   # Hibernate configuration
│
│── src/test/java/            # Unit tests
│── pom.xml                   # Maven configuration
```

---

## 🚀 How to Run

1️⃣ **Clone the repository**

```bash
git clone https://github.com/RohanBansal01/Hibernate-Projects.git
cd Hibernate-Projects
```

2️⃣ **Import project**

* Open **Eclipse** or **IntelliJ IDEA**
* Import any subproject as a **Maven Project**

3️⃣ **Configure database**
Edit `src/main/resources/META-INF/persistence.xml`:

```xml
<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/hibernate_db"/>
<property name="javax.persistence.jdbc.user" value="root"/>
<property name="javax.persistence.jdbc.password" value="your_password"/>
<property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
```

4️⃣ **Run project**
Execute the main driver class (example: `ProjectDriver.java`) from package:

```
com.companyname.projectname.app
```

Hibernate will create tables and perform CRUD operations.

---

## 🔍 Concepts Covered

✔ Hibernate Configuration (`hibernate.cfg.xml`, `persistence.xml`)
✔ Entity Mapping (`@Entity`, `@Table`, `@Id`, etc.)
✔ CRUD operations using DAO pattern
✔ Relationships: One-to-One, One-to-Many, Many-to-Many
✔ HQL (Hibernate Query Language) examples
✔ Second Level Caching
✔ Maven-based modular projects

---

## 📝 Requirements Covered (Mini-Projects)

1. **Laptop Inventory Management (TechHub)** – laptopId, brand, model, price, processor
2. **Bookstore Catalog System (BookVerse)** – bookId, title, author, price, genre
3. **Employee Records (WorkMate)** – empId, name, department, salary, designation
4. **Car Showroom (AutoLux)** – carId, brand, model, price, fuelType
5. **Student Enrollment (EduMax)** – studentId, name, course, email, grade
6. **Movie Collection (StreamFlix)** – movieId, title, language, genre, rating
7. **Hospital Records (MediCare)** – patientId, name, age, diagnosis, admissionDate
8. **Mobile Store (PhoneWorld)** – mobileId, brand, model, price, storage
9. **Restaurant Menu (FoodieHub)** – dishId, name, category, price, availability
10. **Real Estate Listings (PropConnect)** – propertyId, title, location, price, propertyType

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).

---
