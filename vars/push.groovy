def come(String img){
  echo "This stage is pushing the image on DockerHub"
  withCredentials([usernamePassword("credentialsId":"DockerHubCred", passwordVariable: "DockerHubPass", usernameVariable: "DockerHubUser")]){
  sh "sudo docker login -u ${env.DockerHubUser} -p ${env.DockerHubPass} "
  sh "sudo docker image tag ${img}:latest ${env.DockerHubUser}/${img}:latest "
  sh "sudo docker push ${env.DockerHubUser}/${img}:latest"
  }
  echo "successfuly pushed"
}
