# User-Management-FullStack
User-Management-FullStack using Spring Boot and React Library

# Required softwares for Frontend
>Node js

Check is node intalled in your system using below commands:

> node -v

> npm -v
# Required softwares for Backend
> Java (Jdk)

> MySql

# Clone the repository using below command:
> git clone https://github.com/Shailendra-Vishwakarma/User-Management-FullStack.git

# How to run Frontend application
1. > Open frontend module in your any favourite  editor. (Suggestion use - Visual Studio Code )
2. > Delete node modules 
3. > Open terminal or command prompt (If you are using Visual Studio code then open the terminal in /User-Management-FullStack/user-mgmnt-frontend/ directory then after run below command. It will install required packages)
4. > npm install
5. > npm start (It will start the server) after that open below url in you local machine.
6. > http://localhost:3000

# How to run Backend Application
1. > Open backend module in your any favourite ide (suggestion use - IntelliJ)
2. > Open application.properties file and change database name, MySql username & password.
3. > Run /src/com/cybersploit/UserManagementFullStackApplication.java class
4. > Once Tomcat Server will start you can test your application using frontend or PostMan.
5. > If you want to test your API's using PostMan:
    - Get Rquest : http://localhost:8080/users (Retreive all user)
    - Get Rquest : http://localhost:8080/users/{id} (Retreive user by id where id=1)
    - POST Request : http://localhost:8080/user
    >  
        {
        "username": "Test",
        "name": "test",
        "email": "test@gmail.com"
        }
6. > Test Health and Metrics of your application using
   
   - Health: http://localhost:8080/actuators/health
   - Info: http://localhost:8080/actuators/info
   - Metrics: http://localhost:8080/actuators/metrics
    



