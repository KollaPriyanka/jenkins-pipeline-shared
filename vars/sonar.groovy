def call(String msg = 'SONAR'){
  echo "${msg}"
 
  /*environment{
    scannerHome=tool 'sonarscanner'  
  }
  withSonarQubeEnv('sonarqube'){
                     sh 'mvn sonar:sonar'
                }*/
  environment{
                 sonarscanner = tool 'sonarscanner'
                 }
            
               withSonarQubeEnv('sonarqube'){
                     sh '${sonarscanner}/bin/sonar-scanner -Dproject.settings=./sonar-project.properties'
                }
            
}
