pipeline {
    agent any

    stages {
        stage('GetProject') {
            steps {
                git 'https://github.com/catsfeey/springBootFirstApp'
            }
        }
        stage('build') {
            steps {
                //Run Maven on an agent on Linux Machine with Maven installed.
                sh 'mvn clean:clean'
                sh 'mvn dependency:copy-dependencies'
                sh 'mvn compiler:compile'

                //To run Maven on a Windows agent, use bat instead of sh
                // bat "mvn clean"
            }
        }
        stage('Exec') {
            steps {
                sh 'mvn spring-boot:run'
            }
        }
    }
}

