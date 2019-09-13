pipeline
{
agent any
	 tools { 
        maven 'Maven_3.3.9' 
        jdk 'JDK8' 
    }
stages
{
stage('Compile Stage')
{
steps
{
	echo "PATH = ${PATH}"
        echo "M2_HOME = ${M2_HOME}"
}
}
stage('Test Stage')
{
steps
{
	withMaven(maven:'Maven_3.3.9'){
	echo 'In Test Stage'
	}
}
}
stage('Deploy Stage')
{
steps
{
	withMaven(maven:'Maven_3.3.9'){
	echo 'In Deploy Stage'
	}
}
}


}
}
