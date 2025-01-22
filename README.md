# Project MicroServices

Micro-services usando Feign, Spring Cloud, Eureka, Gateway, Circuit Breaker, Resilience4j, ConfigServer, LoadBalancer.
As aplicações utilizam H2 como banco de dados.

## Table of Contents

- [Project MicroServices](#project-microservices)
  - [Table of Contents](#table-of-contents)
  - [Features](#features)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Usage](#usage)
  - [Environment Variables](#environment-variables)
  - [Project Structure](#project-structure)
  - [API Documentation](#api-documentation)
    - [Authentication](#authentication)
  - [Testing](#testing)
  - [Contributing](#contributing)
  - [License](#license)

## Features

- Micro Serviço
- Spring Boot config-serve

## Prerequisites

List what needs to be installed:

- java version "21.0.5" 2024-10-15 LTS
- Apache Maven 3.9.9
- Intellij, Eclipse or STS
- Postman

## Installation

1. Clone the repository

```bash
git clone https://github.com/denissoliveira/MicroService_Config_Cloud.git
```

2. Install dependencies

- java version "21.0.5" 2024-10-15 LTS using [sdkman](https://sdkman.io/install/)
- Apache Maven 3.9.9 using [sdkman](https://sdkman.io/install/)

3. Configure environment variables

does not apply.

## Usage

How to run the project:

```bash
.../rest-spring-boot$ mvn clean install
java -jar rest-spring-boot-0.0.1-SNAPSHOT.jar
.../config-serve$ mvn clean install
java -jar config-serve-0.0.1-SNAPSHOT.jar
```

## Environment Variables

does not apply.

## Project Structure

```text
src/
├── controllers/
├── models/
├── services/
```

## API Documentation

Describe your API endpoints:

### Authentication

`POST http://localhost:8080/person`

- Request body:

```json
{
    "firstName":"Denis",
    "lastName":"Oliveira",
    "address":"Rua MAria",
    "gender":"Male"
}
```

## Testing

How to run tests:

```bash
mvn test
```

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is licensed under the MIT License
