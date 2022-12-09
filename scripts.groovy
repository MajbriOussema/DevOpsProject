def git_clone(){
    git "https://github.com/MajbriOussema/DevOpsProject"
}
def run_unit_tests(){
    sh "mvn clean"
    sh "mvn test"
}
def sonarqube_scan(){
    sh "mvn sonar:sonar -Dsonar.projectKey=devops-project -Dsonar.login=admin -Dsonar.password=oussema"
}
def nexus_deploy(){
    sh "mvn clean package -Dmaven.test.skip=true deploy:deploy-file -DgroupId=com.example -DartifactId=devops-project -Dversion=1.0 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://localhost:8081/repository/maven-releases/ -Dfile=target/devops-project-1.0.jar"
}

return this