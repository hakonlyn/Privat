![UiS](https://www.uis.no/getfile.php/13391907/Biblioteket/Logo%20og%20veiledninger/UiS_liggende_logo_liten.png)

# Lab 1: Tools for Java, Gradle, Eclipse, git

| Lab 1:		| Java programming tools		|
| -------------------- 	| ------------------------------------- |
| Subject: 		| DAT240 Advanced Programming 		|
| Deadline:		| Sep 03 2019 23:59			|
| Expected effort:	| 10-15 hours 				|
| Grading: 		| Pass/fail 				|
| Submission: 		| Individually				|


## Introduction

The overall aim of the labs in this course is to learn how to applications,
deploy them as APIs and microservices. We will do this through a series of
lab exercises that will expose you to developing an application in the Java programming language, and some of
the tools that people frequently use to develop and deploy such applications.

**Task - Install java:**
Install java using instructions [here](https://java.com/en/download/help/download_options.xml))

**Task - Install gradle:**

The first task of this lab is to install gradle by following the instructions [here](https://docs.gradle.org/current/userguide/installation.html). Install Gradle for the respective operating systems (Windows/Linux/Mac) you have. 

**Task - Install necessary toos:**
Mac users you may have to install Command line tools. If you install xcode it might be automatically done. If you have newer version of macos (Mojave) you can install from app store. But if have older version of mac (High Sierra) install appropriate older version of command line tools from (here)[https://developer.apple.com/download/more/]

In Windows you may have to install gitbash (here)[https://git-scm.com/download/win]

**Task - Create an application:**

Create a gradle project to build a java application. Follow the instructions [here](https://guides.gradle.org/building-java-applications/)

**Task - Install Eclipse:**

Install eclipse for your operating system from [here](https://www.eclipse.org). Then install gradle plugin in eclipse. Go to Help -> Eclipse Market Place and search for gradle IDE pack (http://marketplace.eclipse.org/content/gradle-ide-pack) and install the plugin. Restart eclipse.


**Task - Import Gradle project:**

In Eclipse click File -> import -> Gradle and browse to the gradle project you created above and import. See that the project structure is imported and you are able to run the main file.


**Task - Autograder registration:**

You will have to sign up for the lab project in Autograder if you have not
already done so. Instructions for this can be found
[here](https://github.com/uis-dat240-fall19/course-info/blob/master/autograder-registration.md).

Once you have registered in autograder and accepted the confirmation email for the repositories, you need to checkout the assignments repository.

Follow the steps below to clone the github repository and setup the remote

1. Run `git clone https://github.com/uis-dat240-fall19/assignments.git`
2. cd to the assignments directory 
3. Run `git remote add dat240labs https://github.com/uis-dat240-fall19/username-labs`  where `username` should be replaced with your own GitHub username and `dat240labs` can be replaced with any name you prefer.
4. After you have made the changes commit them with `git commit -m "Comment"` and run `git push dat240labs` to have the changes pushed up to your own `username-labs` repository on GitHub. Note that you cloned the original repository but pushing to your own private repository. 
5.  If you make changes to your own `username-labs` repository using the GitHub
   web interface, and want to pull those changes down to your own computer, you
   can run the command: 
	* `git pull dat240labs master` 
	* In later labs, you will work in groups. This approach is also the way that you can download (pull) your group's code changes from GitHub, assuming that another group member has previously pushed it out to GitHub.
6. As time goes by we (the teaching staff) may publish updates to the
   original `labs` repo, e.g. new or updated lab assignments. To see these 
   updates, you will need to run the following command: 
	*  `git pull origin master`.

**Exercise 1 - Fibonacci: (20% points)**

Change directory to: cd assignments/assignment1 and confirm that the files for assignment1 resides in that folder. They should, assuming that you followed the steps above. The file under assignment1/src/main/java/assignment1/Fibonacci.java contains the following skeleton code:

```
package assignment1;

public class Fibonacci {
     	   // Exercise 1: Fibonacci numbers
	   //
	   // fibonacci(n) returns nth Fibonacci number, and is defined by the
	   // recurrence relation F_n = F_n-1 + F_n-2, with seed values F_0=0 and F_1=1.
	public long getFibonacci(long number) {
		
	}
}

```

 Implement the function body according to the specification. 
 
 **Exercise 2 - Palindrome: (40% points)**
 
 ```
 package assignment1;

public class Palindrome {
	
	//This function checks if String s is a permutation of String t
	public static boolean isPermutation(String s, String t) {
		
	}
	
	
	/*This function checks if a given string is a [palindrome](https://en.wikipedia.org/wiki/Palindrome) 
	or not. A palindrome is a word or a sentence which spells same both forwards and backwards. 
	
	Note that it should also support sentence-length palindromes. A sentence-length palindrome 
	allows us to make adjustments to capital letters, punctuation, and word dividers. 
	For example, ``was it a car or a cat i saw'' . To simplify the problem you can ignore 
	all the punctuations, special characters and spaces in the string. 
	
	Note that for the purpose of this assignment palindrome need not be a dictionary word.
	
	
	*/
	
	public static boolean isPalindrome(String s){
		
	}
	

	/* This function returns true if a given string is a permutation of a palindrome.
	
	A permutation of a string is a rearragement of characters in a string, which may not be a palindrome. 
	
	So you have to consider all possible permutations of a string and check if it is a palindrome.
	
	Hint: You do not have to generate all permutations, think of a smart way to achieve this!*/
	public static boolean isPermutationOfPalindrome(String phrase) {
		
	}
	
	

}

 ```
 
  **Exercise 3 - Bounded queue: (40% points)**
  ```
  package assignment1;
/* Implement a BoundedQueue that supports a data structure which is of fixed size and circular,
i.e, insert at the end and the items are being pulled from front should be done in a circular fashion.
I.e, if the end position exceeds the size of the array the index of end should be
fixed appropriately to the beginning of the array. If the queue is full return an error*/

public class BoundedQueue<T> {
	public BoundedQueue(int size){
		//Todo implement the constructor to create a bounded queue of ssize size
	}
	
	//Returns 0 if insertion was successful -1 if it fails
	public Integer insertItem(T item){
		//Write code to insert item at the 'end'
	}
	
	public T getFront(){
		//Write code to return the item at the front and remove that item from the queue
	}
}
  ```
  
For all exercises we have some unit tests but you should write more unit tests using junit to make sure it works and thorough coverage.
