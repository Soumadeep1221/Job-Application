# 🧑‍💻 Job Application Management System (Spring MVC)

This is a **Java Spring MVC–based Job Application Management project** built to understand how Spring Web MVC works internally, including request handling, data binding, and layered architecture.

---

## ✨ What This Application Does

* Add a new job using a form
* View all added jobs in a job list
* Navigate between:

  * Home
  * Add Job
  * View All Jobs
* Data is stored **in memory** (not in a database)

---

## 🛠️ Tech Stack Used

* Java
* Spring Web MVC
* JSP (View Technology)
* Embedded Apache Tomcat
* Lombok
* Maven

---

## 📋 Prerequisites (Required Before Running)

Make sure the following are installed on your system:

### 1️⃣ Java Development Kit (JDK)

* **JDK 17 or above** recommended

Check installation:

```bash
java -version
```

Download:

* [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)

---

### 2️⃣ Maven

Maven is used to manage dependencies and run the project.

Check installation:

```bash
mvn -version
```

Download:

* [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)

---

### 3️⃣ IDE (Recommended)

You can use any IDE, but recommended ones are:

* IntelliJ IDEA (Community Edition)
* Eclipse IDE for Enterprise Java

---

## 🚀 How to Run This Project (Step-by-Step)

### Step 1️⃣ Clone the Repository

```bash
git clone <your-github-repo-link>
```

---

### Step 2️⃣ Open the Project in IDE

* Open IntelliJ / Eclipse
* Open the project
* Wait for Maven dependencies to download

---

### Step 3️⃣ Verify Maven Dependencies

Make sure all dependencies are downloaded successfully.

If needed, run:

```bash
mvn clean install
```

---

### Step 4️⃣ Run the Application

Locate the main class:

```
JobApplication.java
```

Run it as:

* **Java Application** (in IDE)

Spring Boot will:

* Start the embedded Tomcat server
* Deploy the application automatically

---

### Step 5️⃣ Access the Application in Browser

Open your browser and go to:

```
http://localhost:8080/
```

---

## 🧪 How to Use the Application

1. Go to **Add Job**
2. Fill in job details
3. Submit the form
4. Navigate to **View All Jobs**
5. See the added job listed successfully

---

## ⚠️ Important Notes

* No database is used (in-memory list only)
* Data will reset on application restart
* UI is intentionally simple (JSP-based)
* Focus of this project is **learning Spring MVC internals**

---

## 🔮 Future Improvements (Planned)

* Add a proper database (MySQL / PostgreSQL)
* Convert backend to REST APIs
* Build frontend using React
* Make it a full-stack application
