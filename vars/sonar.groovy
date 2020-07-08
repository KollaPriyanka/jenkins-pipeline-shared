def call(String msg = 'SONAR'){
  echo "${msg}"
 
  environment{
    scannerHome=tool 'sonarscanner'  
  }
  withSonarQubeEnv('sonarqube'){
                     sh 'mvn sonar:sonar'
                }
}
