# Facebook Login TestCase
Here we are testing testing the Facebook login page.

# TestCase covers
Here we are only checking the login test-case for few possible test-data listed below.

|| UserName || Password || <br>
|| blank    || blank    || <br>
|| blank    || invalid  || <br>
|| valid    || blank    || <br>
|| valid    || valid    || <br>

# Limitation or Furure Enhancement
- Currently supports only Firefox browser.
- Currently used TestNG parameters to pass the user input. However, we can do it with the help of MS-Excel. 
- We can add more possibility based on login scenarios.
- Does not implement any mechanism for taking screenshot or logger information.
 
# Prerequisites
Below are the few packages/ software should install in you system before running the scenarios.
- Firefox browser.
- Eclipse IDE.
- Java.
- Maven and TestNg Plugin.

# Built With
- The project is designed in Java Language using Data driven framework.

# Installation
Below are the steps that we need to follow in order to run the project
 - [Clone](https://github.com/shankar5522/Assignment_LidoLearning.git) the project into you local system (i.e. into your eclipse IDE)
 - Navigate to **testng.xml** file and change the value according to your Facebook credential for **userName** and **Password** Parameters.
 - Right click on **testng.xml** file then Select **Run as TestNG Suite.**
 
# Authors
  - Shankar Gupta - **[GitHub profile](https://github.com/shankar5522/Assignment_LidoLearning.git)**
  
# License
No License is require.