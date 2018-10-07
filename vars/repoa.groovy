def call(Map pipelineParams) {

    pipeline {
        agent any
        stages {
            stage('checkout git') {
                steps {
                    git branch: '*/master', url: 'https://github.com/Spredzy/jenkins-repoa.git'
                }
            }

            stage('build') {
                steps {
                    sh 'echo "build-repoa"'
                }
            }

            stage ('test') {
                steps {
                    sh 'echo "test-repoa"'
                }
            }
        }
    }
}
