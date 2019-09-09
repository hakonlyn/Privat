package assignment1;
import java.util.Arrays;
import java.util.HashMap;

public class Palindrome {

	 //This function checks if String s is a permutation of String t. Remove white spaces
	
	   /**
	 * @param s first input string 
	 * @param t second input string
	 * @return true if s is a permutation of t
	 */
	public static boolean isPermutation(String s, String t) {
		s = s.replaceAll("\\s", "");
		t = t.replaceAll("\\s", "");
		
		if (s.length() != t.length()) {
			return false;
		}
		
		char sArr[] = s.toCharArray();
		char tArr[] = t.toCharArray();
		
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		
		
		for (int i = 0;i < sArr.length; i++) {
			if (sArr[i] != tArr[i]) {
				return false;
			}
		}
		
		return true;
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
		//remove spaces... with regex
		
		s = s.replaceAll("[^A-Za-z0-9]+", "");
		
		char sArr[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (Character.toLowerCase(sArr[i]) != Character.toLowerCase(sArr[s.length()-1-i])) {
				return false;
			}
		}
		return true;
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
			/* Counting alle the letters
			 * orgonized in a dictonarry
			 * 
			 * */
			
			HashMap<Character, Integer> sHash = new HashMap<>();
		
			s = s.replaceAll("[^A-Za-z0-9]+", "");
			s = s.toLowerCase();
			
			char sArr[] = s.toCharArray();

			for (int i = 0; i < s.length(); i++) {
				if (sHash.containsKey(sArr[i])) {
					sHash.put(sArr[i], sHash.get(sArr[i])+1);
				}
				else {
					sHash.put(sArr[i], 1);
				}
			}
			
			int oddCount = 0;
			for (int i : sHash.values()) {
				if(i%2 != 0) {
					oddCount++;
				}
			}
			if (oddCount > 1) return false;
			
	   		return true;
	   }
}
