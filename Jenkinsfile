pipeline {
    agent any

    stages {

        stage('Verificar Repositório') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']],
                          userRemoteConfigs: [[url: 'https://github.com/GuilhermeLBonomo/GuilhermeBonomoEmissorMicroservicoApplication.git']]])
            }
        }

        stage('Instalar Dependências') {
                    steps {
                        script {
                            env.PATH = "/usr/bin:$PATH"
                            bat 'mvn clean install'
                        }
                    }
        }


        stage('Construir Imagem Docker') {
            steps {
                script {
                    def appName = 'provajhonny1'
                    def imageTag = "${appName}:${env.BUILD_ID}"
                    bat "docker build -t ${imageTag} ."
                }
            }
        }

        stage('Análise SonarQube') {
                                steps {
                                    script {
                                        withSonarQubeEnv('SonarQubeServer') {  // 'SonarQubeServer' é o nome da instância configurada no Jenkins
                                            bat 'mvn clean verify sonar:sonar -Dsonar.projectKey=GuilhermeBonomoEmissorMicroservicoApplication -Dsonar.projectName=GuilhermeBonomoEmissorMicroservicoApplication -Dsonar.token=squ_b76b715aabb86953255617b90ab021f3ab23bd7d'
                                        }
                                    }
                                }
                }

        stage('Fazer Deploy') {
            steps {
                script {
                    def appName = 'provajhonny1'
                    def imageTag = "${appName}:${env.BUILD_ID}"
                    bat "docker stop ${appName} || exit 0"
                    bat "docker rm ${appName} || exit 0"
                    bat "docker-compose up -d --build"
                }
            }
        }
    }


    post {
        success {
            echo 'Deploy realizado com sucesso!'
        }
        failure {
            echo 'Houve um erro durante o deploy.'
        }
    }
}
