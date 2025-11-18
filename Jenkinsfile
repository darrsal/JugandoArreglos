pipeline{
   agent any
   tools{
      maven 'maven_devops'
   }
   triggers{
      githubPush()
   }
   enviroment{
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
            sh 'mvn -f $POM -B'
        }
      }
      stage('Prueba'){
        steps{
            sh 'mvn -f $POM test'
        }
        post{
            always{
                junit 'jugandoArreglos/target/surefire-reports/*.jar'
            }
        }
      }
      stage('Empaquetado'){
        steps{
           sh 'mvn -f $POM package'
            archiveArtifacts artifacts: 'jugandoArreglos/target/*.jar', fingerprint:true
        }
      }  
   }
}
