pipeline{
  agent any
      stages
        {
            stage ("Compile") {
            steps {
                    echo 'compiling the application...'
            }
            }
            stage ("testing") {
            steps {
                    echo 'testing the application...'
            }
            }
            stage ("deployment") {
            steps {
                    echo 'deploying the application...'
            }
          }
        }
}