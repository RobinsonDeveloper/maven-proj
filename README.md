# Jenkins Maven Demo

A simple Maven project demonstrating CI/CD with Jenkins.

## Project Structure

```
jenkins-maven-demo/
├── src/
│   ├── main/java/com/example/
│   │   ├── App.java          # Main entry point
│   │   └── MathUtils.java    # Utility class
│   └── test/java/com/example/
│       ├── AppTest.java
│       └── MathUtilsTest.java
├── Jenkinsfile               # Jenkins Pipeline definition
├── pom.xml                   # Maven build file
└── README.md
```

## Build & Run Locally

```bash
# Compile
mvn clean compile

# Run tests
mvn test

# Package into JAR
mvn package

# Run the JAR
java -jar target/jenkins-maven-demo-1.0-SNAPSHOT.jar
```

## Jenkins Setup

1. Install **Maven** and **JDK 11** in Jenkins → *Manage Jenkins → Global Tool Configuration*
   - Name Maven tool: `Maven 3.9`
   - Name JDK tool: `JDK 11`

2. Create a new **Pipeline** job in Jenkins.

3. Under *Pipeline*, select **Pipeline script from SCM**, point to your repo, and set the script path to `Jenkinsfile`.

4. Run the build — Jenkins will execute: Checkout → Build → Test → Package → Verify.
