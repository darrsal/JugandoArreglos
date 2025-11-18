pipeline{
   agent any
   tools{
      maven 'maven_devops'
   }
   triggers{
      githubPush()
   }
   environment {
        POM="jugandoArreglos/pom.xml"
   }
   stages{
      stage('Descarga'){
         steps{
            git url:'https://github.com/darrsal/JugandoArreglos.git', branch:'main'
         }
      }
      stage('Compilacion'){
        steps{
            sh 'mvn -f $POM -B clean package'
        }
      }
      stage('Prueba'){
        steps{
            sh 'mvn -f $POM verify'
        }
        post{
            always{
                junit 'jugandoArreglos/target/surefire-reports/*.xml'
            }
        }
      }
      stage('Empaquetado'){
        steps{
            archiveArtifacts artifacts: 'jugandoArreglos/target/*.jar', fingerprint:true
        }
      }  
   }
}
