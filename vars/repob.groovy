def call(Map pipelineParams) {

    pipeline {
        agent any
        stages {
            stage('checkout git') {
                steps {
                    git branch: '*/master', url: 'https://github.com/Spredzy/jenkins-repob.git'
                }
            }

            stage('build') {
                steps {
                    sh 'echo "build-repob"'
                }
            }

            stage ('test') {
                steps {
                    sh 'echo "test-repob"'
                }
            }
        }
    }
}
