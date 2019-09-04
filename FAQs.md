# FAQ

Question: I do not see any scores updating in my autograder reseulsts

Answer: Make sure you have no compilation errors. It is important that you do not modify the methods and interfaces provided with the assignments. If you delete the methods and write your own code and it of course compiles locally but autograder expects the class to contain certain methods so do not modify or delete whats already there. You can just add code to the skeleton you get.

Question: I am getting the error "settings file '/home/gradle/user/settings.gradle'. If this is an unrelated build, it must have its own settings file."

Answer: Please remove settings.gradle file from your repository.

Question:
My autograder build is not updating.

Answer:
Try committing the changes to github account and autograder should build automatically. If it is still not updating report the issue to TA or the teacher and continue solving the assignment without autograder and commit your solutions.



Question:
- How to import/open project in eclipse

Answer:
This solution applies to non-Gradle projects
1. File
2. Open Project From File System
3. Find the root directory
4. Press Finish
____
Question:
- Add java to path (Windows only):

Answer:
1. In Search, search for and then select: System (Control Panel)
2. Click the Advanced system settings link.
3. Click Environment Variables. In the section System Variables, find the PATH environment variable and select it. Click Edit. If the PATH environment variable does not exist, click New.
4. In the Edit System Variable (or New System Variable) window, specify the value of the PATH environment variable. Click OK. Close all remaining windows by clicking OK.
    - The path to the Java JDK bin folder
5. Reopen Command prompt window, and run your java code.

____
Question:
- How to use git

Answer:
- First get a local copy of the GitHub repository
  - git clone https://github.com/uis-dat240-fall19/assignments.git
- Add a remote so that changes are saved to your private repository
  - git remote add dat240labs https://github.com/uis-dat240-fall19/username-labs
  - change username with your GitHub username
  - dat240labs can be any name, but would suggest using dat240labs as it will be easy to remember and it will be used in the guides
- Now you can start editing the files.
- When a change has been made to the files, the changes needs to be added to git before it can be uploaded to GitHub, follow these steps each time tou want to update your GitHub repository with the changes you have done:
  1. git add .
  2. git commit -m "a commit message that explains what you have done"
  3. git push dat240labs
- If you want to get the updates from the main assignment repository use this command:
  - git pull origin master
  
___
Question:
- Git failure to push to remote repository
  - Error message:

To https://github.com/uis-dat240-fall19/username-labs  
! [rejected] master -> master (fetch first)  
error: failed to push some refs to 'https://github.com/uis-dat240-fall19/username-labs'  
hint: Updates were rejected because the remote contains work that you do  
hint: not have locally. This is usually caused by another repository pushing  
hint: to the same ref. You may want to first integrate the remote changes  
hint: (e.g., 'git pull ...') before pushing again.  
hint: See the 'Note about fast-forwards' in 'git push --help' for details.  

Answer:  
You won't really be able to fix this so you need to work around this problem if it occurs.
Follow these steps:
1. When in the assignements directory (using command line) go one level up:
  - cd ..
2. Now clone your private repository:
  - git clone https://github.com/uis-dat240-fall19/username-labs
3. Now use the file explorer to copy the assignments from the master repository into the private repository you just cloned.
4. From now on work directly in your private repository and use this command instead:
  - git push
  - You no longer have to use a remote when you push
5. When a new assignment is realeased go to the master assignment repository and use type in:
  - git pull origin master
6. Now copy the new assignment folder into your private repository and work on it there
