#!/usr/bin/env groovy
// vars/nodeBuild.groovy
def call(Map config = [:]) {
    echo "Starting Node.js build"
    try {
        sh "npm ${config.command ?: 'install'}"
        echo "Node.js build completed successfully"
    } catch (Exception e) {
        error "Node.js build failed: ${e.message}"
    }
}
