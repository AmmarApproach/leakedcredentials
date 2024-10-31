#!groovy

pipeline {
    agent { label 'java-slave' }
    options { skipDefaultCheckout() }
    
    stages {
        stage('Git checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            environment { TZ='Europe/Brussels' }
            steps {
                sh './gradlew build --stacktrace'
                step([$class: 'Publisher'])
            }
        }

        stage('SonarQube analysis') {
            steps {
                script {
                    def scannerHome = tool 'SonarQube scanner'
                    withSonarQubeEnv('sonarqube.approach.be') { // SonarQube is already configured in Jenkins
                        sh "${scannerHome}/bin/sonar-scanner -Dsonar.sources=src/main -Dsonar.projectKey=leakedcredentials -Dsonar.java.binaries=."
                    }
                }
            }
        }

        stage("SonarQube Quality Gate check") {
            steps {
                timeout(time: 5, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}
