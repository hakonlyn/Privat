package assignment1;

public class Palindrome {

	 //This function checks if String s is a permutation of String t
	
	   /**
	 * @param s first input string 
	 * @param t second input string
	 * @return true if s is a permutation of t
	 */
	public static boolean isPermutation(String s, String t) {
		for (char chS: s.toCharArray()) {
			for (char chT: t.toCharArray()) {
//				System.out.println(t);
			}
		}
		return false;
	   }
	   
	   
	   /*This function checks if a given string is a [palindrome](https://en.wikipedia.org/wiki/Palindrome) 
	   or not. A palindrome is a word or a sentence which spells same both forwards and backwards. 
	   
	   Note that it should also support sentence-length palindromes. A sentence-length palindrome 
	   allows us to make adjustments to capital letters, punctuation, and word dividers. 
	   For example, ``was it a car or a cat i saw'' . To simplify the problem you can ignore 
	   all the punctuations, special characters and spaces in the string. 
	   
	   Note that for the purpose of this assignment palindrome need not be a dictionary word.
	   
	   
	   */
	   
	   /**
	 * @param s input string
	 * @return Return true if the given string s is a palindrome false otherwise
	 */
	public static boolean isPalindrome(String s){
		   return false;
	   }
	   

	   /* This function returns true if a given string is a permutation of a palindrome.
	   
	   A permutation of a string is a rearragement of characters in a string, which may not be a palindrome. 
	   
	   So you have to consider all possible permutations of a string and check if it is a palindrome.
	   
	   Hint: You do not have to generate all permutations, think of a smart way to achieve this!*/
	
	
	   /**
	 * @param s input string s
	 * @return returns true if the given string s is a permutation of a palindrome
	 */
	public static boolean isPermutationOfPalindrome(String s) {
	   		return false;
	   }
}
