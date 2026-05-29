def call(String url, String branch){
  echo "This stage is coding"
  git url: "${url}", branch: "${branch}"
  echo "code successfully cloned"
}
