# ACME Payment Service

Core payment processing microservice for ACME Corp platform.

## Tech Stack
- Java 11
- Spring Boot 2.7.0
- PostgreSQL
- Maven

## Running Locally
```bash
mvn spring-boot:run
```

## API Endpoints
- POST /api/payments/process
- GET  /api/payments/status/{id}

## ⚠️ Known Vulnerabilities (for POC)
| Dependency | Version | CVE | Severity |
|---|---|---|---|
| log4j-core | 2.14.0 | CVE-2021-44228 | CRITICAL |
| jackson-databind | 2.12.0 | CVE-2020-36518 | HIGH |
| spring-security | 5.5.0 | CVE-2022-22978 | HIGH |
| commons-collections | 3.2.1 | CVE-2015-6420 | CRITICAL |
| snakeyaml | 1.27 | CVE-2022-25857 | HIGH |
| guava | 29.0-jre | CVE-2020-8908 | LOW |
