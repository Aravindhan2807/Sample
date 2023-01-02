pipeline {
    agent any
    tools{
        jdk 'java8'
        maven 'M3'
        git 'Git'
    }
    stages{
        stage('Build'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Aravindhan2807/Sample']]])
                bat 'mvn clean install'
            }
        }
          stage('Test'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Aravindhan2807/Sample']]])
                bat 'mvn test'
            }
        }
        stage('Docker image'){
            steps{
                script{
                    bat 'docker build -t aravindkrish28/devops-integration .'
                }
            }
        }
           stage('Docker Login'){
            steps{
              bat 'docker login -u aravindkrish28 -p dckr_pat_deoQggFl1k1tZdaDE6OUgZNIU44'
            }
        }
             stage('Docker Push '){
            steps{
                script{
                bat 'docker push aravindkrish28/devops-integration'
                }
            }
        }
    }
    post {
		always {
			bat 'docker logout'
		}
	}
}