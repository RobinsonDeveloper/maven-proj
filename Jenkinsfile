pipeline {
    agent any

    tools {
        maven 'Maven 3.9'   // Must match the name configured in Jenkins > Global Tool Configuration
        jdk   'JDK 11'      // Must match the name configured in Jenkins > Global Tool Configuration
    }

    environment {
        APP_NAME = 'jenkins-maven-demo'
    }

    stages {

        stage('Checkout') {
            steps {
                echo "Checking out source code..."
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo "Building ${env.APP_NAME}..."
                sh 'mvn clean compile -B'
            }
        }

        stage('Test') {
            steps {
                echo "Running unit tests..."
                sh 'mvn test -B'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                echo "Packaging the application..."
                sh 'mvn package -DskipTests -B'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Verify') {
            steps {
                echo "Running full verify lifecycle..."
                sh 'mvn verify -B'
            }
        }
    }

    post {
        success {
            echo "Pipeline completed successfully!"
        }
        failure {
            echo "Pipeline failed. Check the logs above."
        }
        always {
            cleanWs()
        }
    }
}
