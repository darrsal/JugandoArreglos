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
            sh 'mvn -f $POM -B clean'
        }
      }
      stage('Prueba'){
        steps{
            sh 'mvn -f $POM -B test'
        }
        post{
            always{
                junit 'jugandoArreglos/target/surefire-reports/*.xml'
            }
        }
      }
      stage('Empaquetado'){
        steps{
           sh 'mvn -f $POM -B package'
            archiveArtifacts artifacts: 'jugandoArreglos/target/*.jar', fingerprint:true
        }
      }  
   }
}
