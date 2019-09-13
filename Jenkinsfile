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
	echo 'mvn compile'
}
}
stage('Test Stage')
{
steps
{
echo 'mvn test'	
}
}
stage('Deploy Stage')
{
steps
{
echo 'success'	
}
}


}
}
