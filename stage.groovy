import hudson.model.*;
 
 
pipeline{ 
	
	agent any
	stages{
		stage("Hello Pipeline") {
                    step{
			script {
				println "Hello Pipeline!"
				println env.JOB_NAME
				println env.BUILD_NUMBER
			}
		    }
                }  
	}
 
}
 
