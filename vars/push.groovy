def call(String img){
  echo "This stage is pushing the image on DockerHub"
  withCredentials([usernamePassword(credentialsId:"DockerHubCred", passwordVariable: "DockerHubPass", usernameVariable: "DockerHubUser")]){
  sh "sudo docker login -u ${DockerHubUser} -p ${DockerHubPass} "
  sh "sudo docker image tag ${img}:latest ${DockerHubUser}/${img}:latest "
  sh "sudo docker push ${DockerHubUser}/${img}:latest"
  }
  echo "successfuly pushed"
}
