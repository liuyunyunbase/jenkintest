pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
		
		stage('Deliver') { 
			steps {
				sh 'docker run -d --name server-eureka --privileged=true --restart=always -p 8761:8761 -v /var/jenkins_home/workspace/simple-java-maven-app/target/EurekaServerTest-0.0.1-SNAPSHOT.jar:/var/server-eureka-V1.0.1.jar java java -jar /var/server-eureka-V1.0.1.jar' 
			}
		}
    }
}