pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                sh 'docker build -t yourusername/prime-numbers-app .'
            }
        }
        
        stage('Push') {
            steps {
                sh 'docker push yourusername/prime-numbers-app'
            }
        }
    }
}
