# PetStore Automation Framework

This repository contains the **PetStore Automation** framework, designed for testing the **Swagger PetStore** APIs. The framework leverages **RestAssured** for API testing, combined with **Cucumber** for BDD, and **TestNG** for test execution. This automation framework provides a structured way to validate the functionality, performance, and reliability of the PetStore API.

## Table of Contents

- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [How to Run Tests](#how-to-run-tests)
- [Test Approach](#test-approach)
  - [API Testing](#api-testing)
  - [BDD with Cucumber](#bdd-with-cucumber)
- [Reporting](#reporting)
- [Contributing](#contributing)
- [License](#license)

---

## Project Overview

The **PetStore Automation Framework** is built to test the REST APIs provided by the **Swagger PetStore**. The framework uses **RestAssured** for making HTTP requests and performing API validations. It follows the **BDD** approach using **Cucumber** to define API scenarios in a human-readable format, while **TestNG** is used as the test execution engine.

The key features tested include:

- Creating, retrieving, updating, and deleting pets
- Managing user sessions
- Store operations (placing orders, fetching inventory)

The framework supports various types of API testing such as functional testing, negative testing, and contract testing.

## Technologies Used

- **Java**: Primary programming language.
- **RestAssured**: A library for simplifying API testing in Java.
- **Cucumber**: For BDD, defining scenarios in Gherkin language.
- **TestNG**: Testing framework for running and managing test suites.
- **Maven**: Build automation tool and dependency manager.
- **Jackson**: For parsing JSON responses.

## Project Structure

```
src
│
├── main
│   └── java
│       └── apiEndpoints           # Contains all API request classes
│       └── apiModels              # POJOs for request/response data models
│
├── test
│   └── java
│       └── stepDefinitions        # Step definitions for Cucumber scenarios
│       └── features               # Cucumber feature files
│       └── testRunners            # Test runners to execute the tests
│
└── README.md                      # Project documentation
```

## Setup and Installation

### Prerequisites

Before setting up the project, ensure you have the following tools installed:

- **Java 8 or above**
- **Maven**

### Installation Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/ManjuVasanth/PetStoreAutomation.git
   ```

2. Navigate to the project directory:

   ```bash
   cd petstoreautomation
   ```

3. Install the required dependencies using Maven:

   ```bash
   mvn clean install
   ```

## How to Run Tests

### Running all tests

To run all the tests in the project, use Maven:

```bash
mvn test
```

### Running specific scenarios

You can run specific tests based on Cucumber tags. For example:

```bash
mvn test -Dcucumber.options="--tags @smoke"
```

This command runs only the scenarios tagged with `@smoke`.

### TestNG execution

The framework also supports running tests using TestNG XML files. You can execute specific test suites by running:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

## Test Approach

### API Testing

The framework uses **RestAssured** to perform RESTful API testing. RestAssured makes it simple to create and execute HTTP requests (GET, POST, PUT, DELETE) and validate the responses by asserting status codes, response payloads, headers, and more.

Example of a simple test:

```java
Response response = given()
    .contentType("application/json")
    .when()
    .get("/pet/{petId}", petId);

response.then().statusCode(200);
```

### BDD with Cucumber

The framework follows **BDD** principles using **Cucumber**. API test cases are written in **Gherkin** format, which makes it easier to understand the scenarios being tested by both technical and non-technical stakeholders.

Example of a **feature file** for creating a pet:

```gherkin
Feature: Pet Store API Testing

  Scenario: Creating a new pet
    Given A pet with the following details
      | id   | name   | status   |
      | 101  | Buddy  | available|
    When I create the pet
    Then The pet should be added successfully
```

The step definitions corresponding to the Gherkin steps are implemented in Java, making HTTP calls using RestAssured and validating responses.

## Reporting

The test execution results are generated using **TestNG**'s default reporting feature. After running the tests, you can view the results under the `test-output` directory, which includes a detailed report of the test execution status, logs, and assertions.

## Contributing

Contributions are welcome! If you'd like to contribute to the project, follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request to the `main` branch.

## License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for more information.

---

Feel free to modify this `README.md` as needed to fit your project more precisely!

