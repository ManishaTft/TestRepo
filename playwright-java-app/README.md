# Playwright Java Application

This project is a Java application that utilizes Playwright for browser automation. It serves as a template for creating automated tests and scripts using Playwright.

## Project Structure

```
playwright-java-app
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── App.java
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── AppTest.java
├── pom.xml
└── README.md
```

## Prerequisites

- Java 11 or higher
- Maven

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   cd playwright-java-app
   ```

2. Build the project using Maven:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn exec:java -Dexec.mainClass="com.example.App"
   ```

## Usage

- The `App.java` file contains the main entry point for the application. You can modify this file to add your automation scripts.
- The `AppTest.java` file contains test cases that utilize Playwright for testing the functionality of the application.

## Running Tests

To run the tests, use the following Maven command:
```
mvn test
```

## License

This project is licensed under the MIT License. See the LICENSE file for details.