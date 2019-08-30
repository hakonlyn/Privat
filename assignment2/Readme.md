![UiS](https://www.uis.no/getfile.php/13391907/Biblioteket/Logo%20og%20veiledninger/UiS_liggende_logo_liten.png)

# Assgnment 2: Java inheritance and I/O

| Lab 1:		| Java programming tools		|
| -------------------- 	| ------------------------------------- |
| Subject: 		| DAT240 Advanced Programming 		|
| Deadline:		| Sep 17 2019 23:59			|
| Expected effort:	| 10-15 hours 				|
| Grading: 		| Pass/fail 				|
| Submission: 		| Individually				|


## Introduction

The overall aim of the labs in this course is to learn how to develop applications,
deploy them as APIs and microservices. We will do this through a series of
lab exercises that will expose you to developing an application in the Java programming language, and some of
the tools that people frequently use to develop and deploy such applications. 

In Assignment 2 you will work on object oriented programming and File I/O operations.



**Exercise 1 - Reading files in Java: (20% points)**

Change directory to: cd assignments/assignment1 and confirm that the files for assignment1 resides in that folder. They should, assuming that you followed the steps above. The file under assignment1/src/main/java/assignment1/Fibonacci.java contains the following skeleton code:

```
package assignment1;

public class ImageLabelReader {
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
