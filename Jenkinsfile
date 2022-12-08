pipeline {
    agent any
    stages {
        stage ('GIT') {
            steps {
                echo "Getting Project from Git";
                git "https://github.com/MajbriOussema/DevOpsProject"; 
            } 
        }
        stage ('MVN CLEAN') {
            steps {
                echo "Maven Clean";
                sh 'mvn clean';
            } 
        }
    }
}