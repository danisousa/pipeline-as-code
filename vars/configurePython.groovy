def call() {
	sh(returnStdout: true, label: "[Python Agent]: Updating references..", script: "apt-get update")
	sh(returnStdout: true, label: "[Python Agent]: Installing git..", script: "apt-get install -y --no-install-recommends git")
	sh(returnStdout: true, label: "[Python Agent]: Cloning python utils..", script: "git clone https://github.com/danisousa/python-utils.git")
	sh(returnStdout: true, label: "[Python Agent]: Installing python dependencies...", script: "pip install -r python-utils/requirements.txt")
}
