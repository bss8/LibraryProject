# Library Application (CS4398/5394) 

Auth

## Pre-requisites and Dependencies

Apache Maven: https://maven.apache.org/     
Node.js and NPM: https://nodejs.org/en/


## Build the app

To build the application manually: 
`mvn clean package`    

You should see "BUILD SUCCESS" on the terminal and a `target` directory should be created under root.

## Run the app

After building the app 

1. `cd target`
2. `java -jar library-0.0.1-SNAPSHOT.jar`
   The application should start
3. Navigate to localhost:8080/hello in a browser to test. 

You should see "CS4398/5394 Library App says hello!World!"

#Viewing the API
To view the available API endpoints and details about them:

Ensure the project is running.    
Navigate to: http://localhost:8080/swagger-ui.html

##Guides
The following guides illustrate how to use some features concretely:

[Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)    
[Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)    
[Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)    
