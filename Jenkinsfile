pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                sh 'docker build -t godhamanthan/prime-numbers-app .'
            }
        }
        
        stage('Push') {
            steps {
                sh 'docker push godhamanthan/prime-numbers-app'
            }
        }
    }
}
