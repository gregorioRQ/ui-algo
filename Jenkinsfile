pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                sh "mvn clean install"
            }
        }
        stage("Test"){
            steps{
                sh "mvn test"
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