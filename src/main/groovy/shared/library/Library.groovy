/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package shared.library

class Library {
    boolean someLibraryMethod() {
        true
    }
    def execute() {
        stage("Stage 1") {
            echo "Executing Stage 1"
          }
        stage("Stage 2") {
            echo "Executing Stage 2"
          }
        stage("Stage 3") {
            echo "Executing Stage 3"
          }
    }
}
