# Dining-Menu
* A dining app that shows the Menu for the SJU Refectory.
<img src="https://user-images.githubusercontent.com/99437824/200611344-6d233ac1-f358-4d5d-a3b3-52ef4b656e55.png" width= "500" height = "500">

## Contribution Process:
* Forks and branches: Each team member has a personal fork of the main repository. Work is done by members on a specific branch separate from the main branch of their fork so that members can keep the main branch of their personal fork up to date with the main repository.
* Pushing changes: When a member has made satisfactory changes and wants to push the changes all the way to the main repository they push from their working branch to the main branch of their fork, then up to the main repository through a pull request. This pull request is reviewed by another team member before being accepted. Upon acceptance, team members should update the scrum board to reflect what work has been done.

Every time you pull from main to your fork, you need to make a few changes so that you can access your own local database. 
First, open JDBCInsert.java and go to the two lines that say: myConnection = DriverManager.getConnection("jdbc:sqlite:/home/YOURNAME/Dining Menu Database/databaseV9.db"); where it says YOURNAME, change it to be your username. For example, eyouso001. Then, change the database name to the most recent one in your Dining Menu Database folder. 
Second, open JDBCSelect.java. Go to the line that says: Connection myConn = DriverManager.getConnection("jdbc:sqlite:/home/YOURNAME/Dining Menu Database/databaseV9.db");
Make the same changes here. 
Last, go into your eclipse project and right click on your project name on the left side. (It should say "Dining Menu Web [Dining-Menu-XX Main]") Go down to build path and select "configure build path." Then, make sure the first item says: sqlite-jdbc-3.39.3.0.jar - home/YOURNAME/Dining Menu Database. If it is under another person's name, your project will not work. 

