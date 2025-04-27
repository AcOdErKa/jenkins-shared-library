#!/usr/bin/env groovy
// vars/mavenBuild.groovy
def call(Map config = [:]) {
    echo "Starting Maven build with goals: ${config.goals ?: 'clean package'}"
    try {
        withMaven(maven: 'Maven3') {
            sh "mvn ${config.goals ?: 'clean package'}"
        }
        echo "Maven build completed successfully"
    } catch (Exception e) {
        error "Maven build failed: ${e.message}"
    }
}
