![UiS](https://www.uis.no/getfile.php/13391907/Biblioteket/Logo%20og%20veiledninger/UiS_liggende_logo_liten.png)

# Assgnment 3: Java Spring boot and Graph processing

| Lab 1:		| Java Spring boot		|
| -------------------- 	| ------------------------------------- |
| Subject: 		| DAT240 Advanced Programming 		|
| Deadline:		| Oct 02 2019 23:59			|
| Expected effort:	| 10-15 hours 				|
| Grading: 		| Pass/fail 				|
| Submission: 		| Individually				|


## Spring boot
In this assignment you will be developing a spring boot RESTful APIs for querying a social network graph from the Marvel universe. the data is found in the file called "marvel-hero-network.csv". Have look at the data.

To get started with spring boot follow the tutorial [here](https://www.tutorialspoint.com/spring_boot/spring_boot_building_restful_web_services.htm) or listen to the tutorial in the lecture. 

## Processing the data
* Read the graph which is in CSV format. You can reuse the code to read file from your previous assignment.
* It is a good idea to use a datastructure such as HashMap<> to store the graph data. The key to this hash map will be the name of the node and value will be a HasSet<> or ArrayList<> which stores the neighbors
* The name of the super heroes contains aliases for example, Iron Man is written as "IRON MAN/TONY STARK" in the data file. 

** You need to split these strings into individual names and store a key for each of them. For example, for a node called "IRON MAN/TONY STARK" you need to insert two keys in the hash map "iron man" and "tony stark"
** You also must convert everything to lower case while parsing the data. 
** Make sure any leading and trailing spaces are removed using trim() String method

## Webservice APIs
Your project should provide following APIs at localhost port 8080 (default tomcat port or spring boot does that for you by default):

* / just a greeting message
* /neighbors?id=super_hero_name 
* /degree?id=super_hero_name 
* /checkedge?id1=super_hero1&id2=super_hero2

## Authentication
