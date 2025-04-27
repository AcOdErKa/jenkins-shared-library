#!/usr/bin/env groovy
// vars/pythonBuild.groovy
def call(Map config = [:]) {
    echo "Starting Python build"
    try {
        sh 'python3 -m venv venv'
        sh ". venv/bin/activate && pip install -r ${config.requirements ?: 'requirements.txt'}"
        echo "Python build completed successfully"
    } catch (Exception e) {
        error "Python build failed: ${e.message}"
    }
}
