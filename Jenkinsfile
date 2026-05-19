pipeline {
    agent any
    tools {
        maven 'maven3'
        jdk   'jdk21'
    }
    stages {
        stage('Checkout') {
            steps {
                echo "Code checked out!"
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean compile -B'
            }
        }
        stage('Test') {
            steps {
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
                sh 'mvn package -DskipTests -B'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
    post {
        success { echo "Build SUCCESS!" }
        failure { echo "Build FAILED!" }
    }
}
