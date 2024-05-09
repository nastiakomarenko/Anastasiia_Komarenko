# Web Application Testing with Selenium

This project contains automated tests for a web application using Selenium WebDriver and JUnit.

## Installation and Running

1. Install the Java Development Kit (JDK).
2. Install Maven if not already installed.
3. Download the project from the repository.
4. Ensure that Chrome WebDriver is installed and its path is configured in the environment variables or in the configuration file.
5. Open the project in your IDE.
6. Run the tests using the command `mvn test`.

## Project Structure

- `src/main/java`: contains the application code.
- `src/test/java`: contains the automated tests.
- `src/test/resources`: contains resources such as data files for tests.
- `pom.xml`: Maven configuration file.

## How to Add New Tests

1. Create a new Java class in the `src/test/java` package to contain your new test.
2. Use Selenium WebDriver to interact with the web page and JUnit to write the tests.
3. Add a new test method to your test class.
4. Run the tests using the `mvn test` command to ensure your new test passes successfully.

## Additional Resources

- [Selenium WebDriver Documentation](https://www.selenium.dev/documentation/en/)
- [JUnit Documentation](https://junit.org/junit5/docs/current/user-guide/)
- [Maven Getting Started Guide](https://maven.apache.org/guides/getting-started/index.html)

