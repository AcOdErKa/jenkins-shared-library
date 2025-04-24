def call() {
    withMaven(maven: 'Maven3') {
        sh 'mvn clean package'
    }
}
