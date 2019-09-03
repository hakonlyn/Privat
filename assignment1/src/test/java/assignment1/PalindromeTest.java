package assignment1;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
	@Test
	public static void testisPermutation()
	{
		assertTrue(Palindrome.isPermutation("to be or not to be!", "toot  be!or toneb"));
		assertFalse(Palindrome.isPermutation("to be or not to be!", "tot  be!or toneb"));
		assertFalse(Palindrome.isPermutation("to be or not to be!", "tot  be!or tondseb"));
	}
	@Test
	public static void testisPalindrome()
	{
		assertTrue(Palindrome.isPalindrome("kayak"));
		assertTrue(Palindrome.isPalindrome("Was it a car or a cat i saw?"));
		assertFalse(Palindrome.isPalindrome("Hello World!"));
		assertTrue(Palindrome.isPalindrome(" "));
		assertTrue(Palindrome.isPalindrome(""));
	}
	@Test
	public static void testisPermutationOfPalindrome()
	{
		assertTrue(Palindrome.isPermutationOfPalindrome("kayak"));
		assertTrue(Palindrome.isPermutationOfPalindrome("Rats live on no evil star"));
		assertFalse(Palindrome.isPermutationOfPalindrome("dogs are cute!"));
	}
	

}
