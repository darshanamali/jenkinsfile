pipeline {
    agent any

    stages {
        stage('Pull Git Content') {
            steps {
                git branch: 'develop', url: 'https://github.com/darshanamali/jenkinsfile.git'
            }
        }

        // Additional stages and steps for your pipeline

    }
}
