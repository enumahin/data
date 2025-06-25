pipeline {
    agent any
    tools {
        maven 'MAVEN3.9'
        jdk 'JDK17'
    }
    stages {
        stage('Fetch Code') {
            steps {
                git branch: 'main', url: 'https://github.com/enumahin/data.git'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Checkstyle') {
            steps {
                sh 'mvn checkstyle:checkstyle'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn install -DskipTests'
            }
            post {
                success {
                    echo 'Archiving...'
                    sh '''
                        mkdir -p versions
                        for file in target/*.jar; do
                            base=$(basename "$file" .jar)
                            cp "$file" "versions/${base}.${BUILD_ID}.jar"
                        done
                    '''
                    // archiveArtifacts artifacts: '**/target/*.jar', followSymlinks: false
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}