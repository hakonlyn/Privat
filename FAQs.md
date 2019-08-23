# FAQ

Question:
- How to import/open project in eclipse

Answer:
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
  - git pull origin dev
  