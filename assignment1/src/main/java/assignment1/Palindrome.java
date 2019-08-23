package assignment1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Palindrome {

    // This function checks if String s is a permutation of String t

    /**
     * @param s first input string
     * @param t second input string
     * @return true if s is a permutation of t
     */
    public static boolean isPermutation(String s, String t) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        t = t.replaceAll("\\s+", "").toLowerCase();
        if (s.length() != t.length())
            return false;
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b))
            return true;
        return false;
    }

    /*
     * This function checks if a given string is a
     * [palindrome](https://en.wikipedia.org/wiki/Palindrome) or not. A palindrome
     * is a word or a sentence which spells same both forwards and backwards.
     * 
     * Note that it should also support sentence-length palindromes. A
     * sentence-length palindrome allows us to make adjustments to capital letters,
     * punctuation, and word dividers. For example, ``was it a car or a cat i saw''
     * . To simplify the problem you can ignore all the punctuations, special
     * characters and spaces in the string.
     * 
     * Note that for the purpose of this assignment palindrome need not be a
     * dictionary word.
     * 
     * 
     */

    /**
     * @param s input string
     * @return Return true if the given string s is a palindrome false otherwise
     */
    public static boolean isPalindrome(String s) {
        char a[] = s.replaceAll("\\W", "").toLowerCase().toCharArray();
        int i = 0;
        int j = a.length - 1;
        while (j > i) {
            if (a[i] != a[j]) return false;
            i++;
            j--;
        }
        return true;

    }

    /*
     * This function returns true if a given string is a permutation of a
     * palindrome.
     * 
     * A permutation of a string is a rearragement of characters in a string, which
     * may not be a palindrome.
     * 
     * So you have to consider all possible permutations of a string and check if it
     * is a palindrome.
     * 
     * Hint: You do not have to generate all permutations, think of a smart way to
     * achieve this!
     */

    /**
     * @param s input string s
     * @return returns true if the given string s is a permutation of a palindrome
     */
    public static boolean isPermutationOfPalindrome(String s) {
        char a[] = s.replaceAll("\\W", "").toLowerCase().toCharArray();
        int len = a.length;
        Map<Character, Integer> b = new HashMap<Character, Integer>();
        for (int i = 0; i < len; i++) {
            if (b.containsKey(a[i])) {
                b.put(a[i], b.get(a[i]) + 1);
            } else {
                b.put(a[i], 1);
            }
        }
        if ((len % 2) == 0) {
            for (int i : b.values()) {
                if ((i % 2) != 0) return false;
            }
            return true;
        } else {
            int count = 0;
            for (int i : b.values()) {
                if ((i % 2) != 0) {
                    count++;
                    if (count > 1) return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("dette er en test", "dette er en test"));
    }
}
