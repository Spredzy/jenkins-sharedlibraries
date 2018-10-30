def call(Map pipelineParams) {

    pipeline {

        agent {
            label 'jenkins-jnlp-agent'
        }

        stage('Build RPM and TAR') {
            steps {
              sh 'echo "Build RPM and TAR"'
            }
        }

        stage('Install Cluster') {
            steps {
              sh 'echo "Install Cluster"'
            }
        }

        stage('Run full test suite') {
            steps {
              sh 'echo "Run full test suite"'
            }
        }

    }
}
