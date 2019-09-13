pipeline
{
agent any
stages
{
stage('Compile Stage')
{
steps
{
	withMaven(maven:'Maven_3.3.9'){
	echo 'In Compile Stage'
	}
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
