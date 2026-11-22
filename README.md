# Android Mobile App Automation Framework (Appium + Java)

A mobile test automation framework for Android apps, built with **Appium, Java, TestNG and Maven** and structured using the **Page Object Model (POM)**.

## Tech stack

| Area | Tool |
|---|---|
| Language | Java 19 |
| Mobile automation | Appium 2.13.1 |
| Test runner | TestNG |
| Build & dependencies | Maven |
| Logging | SLF4J |
| Design pattern | Page Object Model |

## Key features

- **Page Object Model:** screen locators and actions are separated from test logic, keeping tests readable and easy to maintain.
- **Config-driven setup:** the Appium server URL and emulator/device details live in `application.properties`, so no code changes are needed to switch environments.
- **Structured logging** with SLF4J for easier debugging of failed runs.
- **One-command execution** through Maven and TestNG.

## Prerequisites

1. **Java 19** (tested with 19.0.1)
2. **Appium 2.13.1** with the UiAutomator2 driver
3. **Android Studio** with an Android emulator created
4. **Maven**

## Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/uditsaxena27/android-appium-framework.git
   cd android-appium-framework
   ```
2. Update `application.properties` with:
   - your Appium server URL
   - your emulator/device details
3. Install dependencies:
   ```bash
   mvn clean install
   ```

## Running the tests

Start the Appium server and the emulator, then run:

```bash
mvn clean test
```

## Project structure

<img width="372" alt="Project structure" src="https://github.com/user-attachments/assets/30e4c9f4-a6fe-4efd-8d72-dbdec5cd6075" />

## Author

**Udit Saxena**, Senior Test Engineer
[LinkedIn](https://www.linkedin.com/in/uditsaxena27)
