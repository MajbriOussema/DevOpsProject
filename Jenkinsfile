def gv

pipeline {
    agent any
    stages {
        stage("initialize") {
            steps {
                script {
                    gv = load "scripts.groovy"
                }
            }
        }
        stage("cloning git") {
            steps {
                script { 
                    gv.git_clone()
                }
            }
        }
        stage("Sonarqube Scan") {
            steps {
                script { 
                    gv.sonarqube_scan()
                }
            }
        }
        stage("Nexus Deployment") {
            steps {
                script { 
                    gv.nexus_deploy()
                }
            }
        }    
        
    }
}