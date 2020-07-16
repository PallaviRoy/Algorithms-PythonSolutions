package cracking_the_coding_interview.chapter_1_arrays_and_strings;

/*
* Q. Given two strings, write a method to decide if one is a permutation of the other.
*/

public class Q2_CheckPermutation {

    public boolean checkPermutation (String s1, String s2){
        // considering all characters in input string are in ASCII
        if (s1 ==  null || s2 == null || s1.length() != s2.length())
            return false;

        int[] characterCount = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            characterCount[s1.charAt(i)]++;
            characterCount[s2.charAt(i)]--;
        }

        for (int count : characterCount) {
            if (count != 0)
                return false;
        }
        return true;
    }

}
