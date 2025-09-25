pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                # Se usa bat porque jenkins está corriendo en windows
                bat "mvn clean install"
            }
        }
        stage("Test"){
            steps{
                bat "mvn test"
            }
        }
        stage("Deploy"){
            steps{
                echo "Simulando un despliegue"
            }
        }
    }
    post{
        always{
            echo "Esto siempre se ejecutará"
        }
        success{
            echo "Esta parte se ejecuta solo si todo el pipeline se ejecuta"
        }
        failure{
            echo "Esta parte se ejecuta solo si falla"
        }
    }
}