def call(String msg = 'SONAR'){
  echo "${msg}"
 
  environment{
    scannerHome=tool 'sonarscanner'  
  }
  withSonarQubeEnv('SonarQube'){
                     sh 'mvn sonar:sonar'
                }
}
