pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Vinayantharagatte/kkkk.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean verify'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
