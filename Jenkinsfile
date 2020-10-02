#!/usr/bin/env groovy
// @Library('jenkins-library') _
// @Library('https://github.com/arvid-erickson/shared-library') _
// new pipeline()
// shared.library.execute()

stage('Test') {
    print "Test stage" 
}
stage('Compile') {
    print "Compile stage"
}
stage('Gradle') {
    sh 'gradle build clean'   
}
