# Dining-Menu
* A dining app that shows the Menu for the SJU Refectory.
<img src="https://user-images.githubusercontent.com/61028069/204590164-ec0885db-7ba0-4670-954c-2e6e27454779.png" width= "500" height = "500">

**Inital Setup**
  This project was developed in Linux using the Eclipse IDE. The website runs on a local Tomcat v9.0 server. The following are the steps necessary to run the project. We recommend working within a Linux OS. You’ll first need to download and install Eclipse IDE 2022; downloads can be found on the Eclipse website. Open eclipse and follow the prompts to set up your eclipse-workspace. From your terminal, navigate to the eclipse-workspace directory. Once in the eclipse-workspace directory, clone the repository. Confirm the project is in eclipse-workspace directory. Back in the Eclipse IDE, right click on the “Project Explorer” tab. Hover your cursor over “import” then navigate over and select “import...”. You should now see an import wizard window. Expand the “General” folder and select “Existing Projects into Workspace”. You should be brought to an Import Projects window; this window lets you import projects into the Eclipse IDE. Make sure “Select root directory: ” is selected the click “Browse...”. Find the project file (it should be in your eclipse-workspace). Select it and click “Open”, you should be brought back to the import window. You should now see the project, check the box next to the project and you’re now ready to click “Finish” in the bottom right corner. You should now see the project in the Project Explorer. To run the webpage select src > main > java > webapp and look for HomePage.jsp. Right click on the file, navigate down to "Run As" and select "Run on Server". The server should run and the webpage should be loaded into your bowser.  

## Contribution Process:
* Forks and branches: Each team member has a personal fork of the main repository. Work is done by members on a specific branch separate from the main branch of their fork so that members can keep the main branch of their personal fork up to date with the main repository.
* Pushing changes: When a member has made satisfactory changes and wants to push the changes all the way to the main repository they push from their working branch to the main branch of their fork, then up to the main repository through a pull request. This pull request is reviewed by another team member before being accepted. Upon acceptance, team members should update the scrum board to reflect what work has been done.

Every time you pull from main to your fork, you need to make a few changes so that you can access your own local database. 
First, open JDBCInsert.java and go to the two lines that say: myConnection = DriverManager.getConnection("jdbc:sqlite:/home/YOURNAME/Dining Menu Database/databaseV9.db"); where it says YOURNAME, change it to be your username. For example, eyouso001. Then, change the database name to the most recent one in your Dining Menu Database folder. 
Second, open JDBCSelect.java. Go to the line that says: Connection myConn = DriverManager.getConnection("jdbc:sqlite:/home/YOURNAME/Dining Menu Database/databaseV9.db");
Make the same changes here. 
Last, go into your eclipse project and right click on your project name on the left side. (It should say "Dining Menu Web [Dining-Menu-XX Main]") Go down to build path and select "configure build path." Then, make sure the first item says: sqlite-jdbc-3.39.3.0.jar - home/YOURNAME/Dining Menu Database. If it is under another person's name, your project will not work. 

**Resources**
SQLite Studio: https://sqlitestudio.pl/
sqlite-jdbc-3.39.3.0.jar: https://github.com/xerial/sqlite-jdbc/releases
