package cracking_the_coding_interview.chapter_1_arrays_and_strings;

/*
* Given a string, write a function to check if it is a permutation of
* a palindrome. A palindrome is a word or phrase that is the same forwards and backwards.
* A permutation is a rearrangement of letters. The palindrome does not need to be limited
* to just dictionary words.
* */

public class Q4_PalindromePermutation {

    boolean isPermutationOfPalindrome(String phrase) {
        if (phrase == null || phrase.isBlank())
            return true;

        // considering all characters in input string are in ASCII
        int[] characterCount = new int[128];

        for (char c: phrase.toCharArray()) {
            if (characterCount[c] > 0)
                characterCount[c]--;
            else
                characterCount[c]++;
        }

        boolean isOdd = false; // only one character in the string can have odd number of counts
        for (int count : characterCount) {
            if (count !=0) {
                if (!isOdd) isOdd = true;
                else return false;
            }
        }
        return true;
    }
}
