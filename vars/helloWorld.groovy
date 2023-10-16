def call(){
   sh "checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'git-hub', url: 'https://github.com/nayab786910/myspring-boot.git']])"
}
