# Digital Nurture – Java FSE Hands-On

This repository contains my completed hands-on exercises for the **Cognizant Digital Nurture – Java Full Stack Engineering** program, organized week by week.

Each exercise below lists **where it lives**, **what it demonstrates**, and **how to check/run it**.

> `Digital-Nurture-JavaFSE-main/` holds the original course material (PDFs/DOCX problem statements). All my solutions live under `Week 1/`, `Week 2/`, and `Week 3/`.

---

## Prerequisites

| Tool | Used for |
|------|----------|
| JDK 17+ | Compiling/running all Java exercises |
| Maven 3.6+ | The TDD and Spring projects (`pom.xml` based) |
| Oracle DB / SQL client | Running the PL/SQL scripts |

Verify your toolchain:

```bash
java -version
mvn -version
```

---

## Week 1

### 1. Data Structures & Algorithms
Path: `Week 1/Data structures and Algorithms/`

| Exercise | Folder | Demonstrates |
|----------|--------|--------------|
| E-commerce Platform Search | `E-commerce Platform Search Function/` | Linear vs Binary Search (Big-O analysis in `analysis.md`) |
| Financial Forecasting | `Financial Forecasting/` | Recursive future-value calculation (analysis in `Analysis.md`) |

**How to check:** read the `*.md` analysis files, view `screenshots/`, or run:

```bash
cd "Week 1/Data structures and Algorithms/E-commerce Platform Search Function"
javac SearchDemo.java && java SearchDemo
```
```bash
cd "Week 1/Data structures and Algorithms/Financial Forecasting"
javac FinancialForecast.java && java FinancialForecast
```

### 2. Design Principles & Patterns
Path: `Week 1/Design principles & Patterns/`

| Pattern | Folder | Entry point |
|---------|--------|-------------|
| Factory Method | `FactoryMethodPatternExample/` | `FactoryTest.java` (creates Word/Pdf/Excel documents) |
| Singleton | `SingletonPatternExample/` | `SingletonTest.java` (single `Logger` instance) |

**How to check:**

```bash
cd "Week 1/Design principles & Patterns/FactoryMethodPatternExample"
javac *.java && java FactoryTest
```
```bash
cd "Week 1/Design principles & Patterns/SingletonPatternExample"
javac *.java && java SingletonTest
```
Reference output is in each folder's `screenshots/`.

### 3. PL/SQL Programming
Path: `Week 1/PL SQL Programming/`

| File | Purpose |
|------|---------|
| `Database_Setup.sql` | Creates tables and seed data (run first) |
| `Exercise1_ControlStructures.sql` | Control structures (IF/LOOP) scenarios |
| `Exercise3_StoredProcedures.sql` | Stored procedures scenarios |

**How to check:** run `Database_Setup.sql` first, then each exercise script in an Oracle SQL client. Executed results are captured per scenario in `screenshots/`.

### 4. TDD using JUnit5 & Mockito
Path: `Week 1/TDD using JUnit5 and Mockito/tdd/` (Maven project)

Covers JUnit 5 basics and Mockito (mocking, stubbing, verifying interactions). Source in `src/main/java/com/cognizant/`, tests in `src/test/java/com/cognizant/`.

| Test | Covers |
|------|--------|
| `CalculatorTest`, `StringUtilsTest` | JUnit 5 assertions / basic testing |
| `BankAccountTest`, `EmployeeTest`, `StudentTest` | Lifecycle, parameterized/assertion testing |
| `UserServiceTest`, `ApiServiceTest` | Mockito mocks, stubbing & `verify()` interactions |

**How to check:**

```bash
cd "Week 1/TDD using JUnit5 and Mockito/tdd"
mvn test
```

---

## Week 2

### 5. SLF4J Logging Framework
Path: `Week 2/SLF4J logging framework/logging-slf4j/` (Maven project)

`LoggingExample.java` logs an **error** and a **warning** message via SLF4J. Sample output in `output.png`.

**How to check:**

```bash
cd "Week 2/SLF4J logging framework/logging-slf4j"
mvn compile exec:java -Dexec.mainClass=com.cognizant.LoggingExample
```

### 6. Spring Core & Maven
Path: `Week 2/Spring Core and Maven/`

Two projects cover the Spring Core → Spring Boot exercises. Screenshots for each exercise are under `screenshots/Exercise N/`.

#### a) `LibraryManagement/library-management/` — Spring Core (XML/annotation config)
Demonstrates the exercise progression inside `BookService.java` (each stage kept as commented history):

| Exercise | Concept |
|----------|---------|
| 1 | Configuring a basic Spring application |
| 2 | Dependency Injection (setter) via `applicationContext.xml` |
| 5 | Spring IoC container |
| 6 | Annotation-based DI (`@Service`, `@Autowired`) |
| 7 | Constructor + setter injection |
| 8 | AOP logging (`aspect/LoggingAspect.java`) |

Run:
```bash
cd "Week 2/Spring Core and Maven/LibraryManagement/library-management"
mvn compile exec:java -Dexec.mainClass=com.library.LibraryManagementApplication
```

#### b) `LibraryManagementSpringBoot/` — Exercise 9: Spring Boot REST app
A Spring Boot app exposing a `Book` REST API backed by an in-memory **H2** database (see `application.properties`).

| Endpoint | Description |
|----------|-------------|
| `POST /books` | Add a book |
| `GET /books` | List all books |

Run (defaults to **port 8081**):
```bash
cd "Week 2/Spring Core and Maven/LibraryManagementSpringBoot"
mvn spring-boot:run
```
- App: <http://localhost:8081/books>
- H2 console: <http://localhost:8081/h2-console> (JDBC URL `jdbc:h2:mem:librarydb`, user `sa`)

Screenshots (project structure, terminal, localhost, H2 console) are in `screenshots/Exercise 9/`.

---

## Week 3

### 7. Spring REST with Spring Boot
Path: `Week 3/spring-rest-handson/` (Maven / Spring Boot project)

A single Spring Boot application covering the Spring REST hands-on set — a plain Hello World endpoint, a `Country` service loaded from Spring XML configuration, and a JWT-based authentication endpoint (Spring Security + `jjwt`). Runs on **port 8083** (see `application.properties`).

| Layer | Key files |
|-------|-----------|
| Controllers | `controller/HelloController.java`, `controller/CountryController.java`, `controller/AuthenticationController.java` |
| Model | `model/Country.java`, `model/AuthenticationResponse.java` |
| Service / config | `service/CountryService.java`, `resources/country.xml` (Spring XML bean) |
| Security / JWT | `security/SecurityConfig.java`, `util/JwtUtil.java` |

| Hands-on | Endpoint | Demonstrates |
|----------|----------|--------------|
| 1.1 | — | Create a Spring Web project using Maven |
| 1.4 | `GET /country` | Load `Country` from Spring XML configuration |
| 2.2 | `GET /hello` | Hello World RESTful web service |
| 2.3 | `GET /country` | REST Country web service |
| 2.5 | `GET /countries/{code}` | Get a country by its code |
| 5.3 | `GET /authenticate` | Authentication service that returns a JWT |

Run (defaults to **port 8083**):
```bash
cd "Week 3/spring-rest-handson"
mvn spring-boot:run
```
- Hello: <http://localhost:8083/hello>
- Country: <http://localhost:8083/country> · by code: <http://localhost:8083/countries/IN>
- Authenticate: <http://localhost:8083/authenticate> (returns a JWT)

Screenshots for each hands-on are under `Week 3/screenshots/`.

---

## Verifying screenshots

Every exercise that produces visual output includes a `screenshots/` folder next to its code, so results can be checked without re-running the project.

---

## Repository layout

```
.
├── Week 1/
│   ├── Data structures and Algorithms/
│   ├── Design principles & Patterns/
│   ├── PL SQL Programming/
│   └── TDD using JUnit5 and Mockito/
├── Week 2/
│   ├── SLF4J logging framework/
│   └── Spring Core and Maven/
├── Week 3/
│   └── spring-rest-handson/         # Spring Boot REST + JWT auth
└── Digital-Nurture-JavaFSE-main/   # original course material (reference)
```
