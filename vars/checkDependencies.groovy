def call() {
	def deps = sh(returnStdout: true, label: "[Python Agent]: Checking dependencies..", script: "python python-utils/check_deps.py")
	println "${deps}"
}