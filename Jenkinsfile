node {
    
    def docker=tool name: 'dockerruntime', type: 'dockerTool'
    def docCMD = "${docker}/bin/docker"
    
    stage('GIT Checkout') {
        git 'https://github.com/lakshmanandevops/devopsBootcamp.git'
    }
    stage('Compile/Test/Package') {
        def mvnHome = tool name: 'Maven', type: 'maven'
        def mvnCMD = "${mvnHome}/bin/mvn"
        sh "${mvnCMD} clean package"
    }
    stage('Docker Build') {
        
        sh "sudo ${docCMD} build -t laxans16/cicd-demo:5.0 ."
    }

    stage('Docker Push') {
        withCredentials([string(credentialsId: 'dockerPwd', variable: 'dockerHubPwd')]) {
            sh "sudo ${docCMD} login -u laxans16 -p ${dockerHubPwd}"
        }
        sh "sudo ${docCMD} push laxans16/cicd-demo:5.0"
        sh " sudo ${docCMD} system prune -af"
    }

    stage('Docker Run') {

        sh "sudo ${docCMD} run -d -p 8090:8090 laxans16/cicd-demo:5.0"
    }


}