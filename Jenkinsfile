pipeline 
{
	agent any
	tools
	{
		maven 'MAVEN_HOME'
	}
	stages
	{
		stage('Welcome Stage')
		{
			steps
			{
				echo 'Welcome to Jenkins Pipeline'
			}			
		}
		stage('Clean Stage')
		{
			steps
			{
				bat 'mvn clean'
			}			
		}
		stage('Test Stage')
		{
			steps
			{
				bat 'mvn test'
			}			
		}
		stage('Build Stage')
		{
			steps
			{
				bat 'mvn install'
			}			
		}
		
		stage('Success Stage')
		{
			steps
			{
				echo 'Successfully Build'
			}			
		}
	
	}
}