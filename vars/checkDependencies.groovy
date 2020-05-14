def call() {
	def deps = sh(returnStdout: true, label: "[Python Agent]: Checking dependencies..", script: "")
	println "${deps}"
}