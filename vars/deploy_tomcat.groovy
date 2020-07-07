def call(String msg = 'deploy_dev') {
echo "${msg}"
 deploy adapters: [tomcat8(credentialsId: 'tomcat_cred', path: '', url: 'http://18.189.16.15:8080')], contextPath: 'shared_lib', onFailure: false, war: '**/*.war'
            }
