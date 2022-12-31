pipeline {
    agent any
    tools{
        jdk "java8"
        maven "M3"
    }
    stages{
        stage('Build'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '**']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Aravindhan2807/Sample']]])
                sh 'mvn clean install'
            }
        }
        stage('docker image'){
            steps{
                script{
                    sh 'docker build -t aravindkrish28/devops-integration .'
                }
            }
        }
    }
}