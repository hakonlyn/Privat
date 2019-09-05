package assignment1;
import org.junit.Test;
import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {
	
	@Test
	public void testisPermutation()
	{
//		System.out.println(Palindrome.isPermutation("to be or not to be!", "toot  be!or toneb"));
//		System.out.println(Palindrome.isPermutation("to be or not to be!", "tot  be!or toneb"));
//		System.out.println(Palindrome.isPermutation("to be or not to be!", "tot  be!or tondseb"));
		
		assertTrue(Palindrome.isPermutation("to be or not to be!", "toot  be!or toneb"));
		assertFalse(Palindrome.isPermutation("to be or not to be!", "tot  be!or toneb"));
		assertFalse(Palindrome.isPermutation("to be or not to be!", "tot  be!or tondseb"));
	}
	@Test
	public void testisPalindrome()
	{	
		assertTrue(Palindrome.isPalindrome("kayak"));
		assertTrue(Palindrome.isPalindrome("Was it a car or a cat i saw?"));
		assertFalse(Palindrome.isPalindrome("Hello World!"));
		assertTrue(Palindrome.isPalindrome(" "));
		assertTrue(Palindrome.isPalindrome(""));
	}
	@Test
	public void testisPermutationOfPalindrome()
	{
//		System.out.println(Palindrome.isPermutationOfPalindrome("kayak"));
//		System.out.println(Palindrome.isPermutationOfPalindrome("Rats live on no evil star"));
//		System.out.println(Palindrome.isPermutationOfPalindrome("dogs are cute!"));@
		
		assertTrue(Palindrome.isPermutationOfPalindrome("kayak"));
		assertTrue(Palindrome.isPermutationOfPalindrome("Rats live on no evil star"));
		assertFalse(Palindrome.isPermutationOfPalindrome("dogs are cute!"));
	}
	

}
