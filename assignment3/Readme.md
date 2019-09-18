![UiS](https://www.uis.no/getfile.php/13391907/Biblioteket/Logo%20og%20veiledninger/UiS_liggende_logo_liten.png)

# Assgnment 3: Java Springboot and Graph processing

| Lab 1:		| Java OO Programing tools		|
| -------------------- 	| ------------------------------------- |
| Subject: 		| DAT240 Advanced Programming 		|
| Deadline:		| Oct 02 2019 23:59			|
| Expected effort:	| 10-15 hours 				|
| Grading: 		| Pass/fail 				|
| Submission: 		| Individually				|


## Spring boot
In this assignment you will be developing a spring boot RESTful APIs for querying a social network graph from the Marvel universe. the data is found in the file called "marvel-hero-network.csv". Have look at the data.

To get started with spring boot follow the tutorial [here](https://www.tutorialspoint.com/spring_boot/spring_boot_building_restful_web_services.htm) or listen to the tutorial in the lecture. 

Your project should provide following apis at localhost port 8080 (default tomcat port):

* / just a greeting message
* /neighbors?id=super_hero_name 
* /degree?id=super_hero_name 
* /checkedge?id1=super_hero1&id2=super_hero2

