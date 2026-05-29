def call(String img){
  echo "This stage is building"
  sh "sudo docker build -t ${img}:latest ."
}
