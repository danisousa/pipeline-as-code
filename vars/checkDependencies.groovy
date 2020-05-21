def call() {
	def deps = sh(returnStdout: true, label: "[Python Agent]: Checking dependencies..", script: "python python-utils/check_deps.py")
	if(deps.length() > 0){
		currentBuild.result='UNSTABLE'
		println "${deps}"
	}else{
		println "All dependencies are validated"
	}
}