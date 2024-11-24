1. Installation of IntelliJ(IDE) in local machine
   https://www.jetbrains.com/idea/

2. Verify Java in local machine and if required (Install), then setting up:
   system & environment variables (by default windows does not recognise Java, updating system and environment variables allows for that)
   Install Java - https://www.oracle.com/za/java/technologies/downloads/ (*take note of where iit is installed)
   To confirm Java is installed go to cmd and run java --version

To update -> on your machine search for Edit the system environment variables control panel in Widows search bar
Under User variables go to Path -> add a new variable which is the path to where your java bin folder is e.g. C:\Program Files\Java\jdk-22
Under System variables -> add a new variable called JAVA_HOME and add path to where your java bin folder is



3. Verify Maven in local machine and if required (download - unlike Java it has no installation file)
   Install Maven - https://maven.apache.org/download.cgi (confirm the version of Java, Maven is compatible with)

To update -> on your machine search for Edit the system environment variables control panel in Widows search bar
Under User variables go to Path -> add a new variable %MAVEN_HOME%\bin
Under System variables -> add a new variable called MAVEN_HOME and add path to where your Maven bin folder is e.g. C:\Program Files\Maven\apache-maven-3.9.8
Confirm Maven - run script in command prompt mvn --version

4. Install Cucumber plugin
   Open IntelliJ go to File -> Settings -> Plugins and install
   Cucumber for Java
   Gherkin - this allows for the addition of the Feature file and understanding the Gherkin language of GIVEN WHEN THEN

5. Create a Maven Project and add Cucumber dependencies
   Copy below and add as a dependencies in the project pom.xml (**remember to load Maven changes)
   https://mvnrepository.com/artifact/io.cucumber/cucumber-java
   https://mvnrepository.com/artifact/io.cucumber/cucumber-junit
   https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java



6.1 Download & add Selenium Webdriver dependency
https://googlechromelabs.github.io/chrome-for-testing/known-good-versions-with-downloads.json

6.2 Install & add Chrome web driver in the project
7. Add one test

