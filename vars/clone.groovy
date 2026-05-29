def call(string url, string branch){
  echo "This stage is coding"
  git url: "${url}", branch: "${branch}"
  echo "code successfully cloned"
}
