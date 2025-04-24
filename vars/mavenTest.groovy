def call() {
    withMaven(maven: 'Maven3') {
        sh 'mvn test'
    }
    junit '**/target/surefire-reports/*.xml'
}
