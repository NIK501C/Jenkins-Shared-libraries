def call(String img){
  echo "This stage is building"
  sh "/usr/bin/docker build -t ${img}:latest ."
}
