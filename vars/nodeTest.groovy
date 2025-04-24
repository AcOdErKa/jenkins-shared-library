def call() {
    sh 'npm test'
    junit '**/test-results.xml'
}
