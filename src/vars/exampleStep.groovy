def call(Map config) {
  config.each {
    it -> sh "echo '$it.key'"
  }
}