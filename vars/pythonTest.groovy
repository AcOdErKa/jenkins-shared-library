#!/usr/bin/env groovy
// vars/pythonTest.groovy
def call(Map config = [:]) {
    echo "Starting Python tests"
    try {
        sh ". venv/bin/activate && pytest ${config.pytestOptions ?: '--junitxml=test-results.xml'}"
        junit allowEmptyResults: true, testResults: 'test-results.xml'
        echo "Python tests completed successfully"
    } catch (Exception e) {
        error "Python tests failed: ${e.message}"
    }
}
