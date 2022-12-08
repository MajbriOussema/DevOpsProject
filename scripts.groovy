def git_clone(){
    git "https://github.com/MajbriOussema/DevOpsProject"
}
def sonarqube_scan(){
    sh "mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=oussema"

}
return this