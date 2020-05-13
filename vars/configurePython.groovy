def call() {
	sh(returnStdout: true, label: "[DOCKER]: Updating references..", script: "apt-get update")
	sh(returnStdout: true, label: "[DOCKER]: Installing git..", script: "apt-get install -y --no-install-recommends git")
	sh(returnStdout: true, label: "[DOCKER]: Cloning python utils..", script: "git clone https://github.com/danisousa/python-utils.git")
	sh(returnStdout: true, label: "[DOCKER]: Installing python dependencies...", script: "pip install -r python-utils/requirements.txt")
}
