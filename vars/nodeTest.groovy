#!/usr/bin/env groovy
// vars/nodeTest.groovy
def call(Map config = [:]) {
    echo "Starting Node.js tests"
    try {
        sh "npm ${config.testCommand ?: 'test'}"
        junit allowEmptyResults: true, testResults: '**/test-results.xml'
        echo "Node.js tests completed successfully"
    } catch (Exception e) {
        error "Node.js tests failed: ${e.message}"
    }
}
