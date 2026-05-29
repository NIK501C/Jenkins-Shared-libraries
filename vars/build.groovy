def call(String img){
  echo "This stage is building"
  sh "docker build -t ${img}:latest ."
}
