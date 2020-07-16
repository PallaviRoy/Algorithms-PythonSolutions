package cracking_the_coding_interview.chapter_1_arrays_and_strings;

/*
* Q. Implement an algorithm to determine if a string has all unique characters.
*   Follow up : What if you cannot use additional data structures?
*/

public class Q1_IsUnique {

    public boolean isUnique (String s) {
        // Additional Space
        // considering all characters in input string are in ASCII
        if (s == null || s.isEmpty())
            return true;

        if (s.length() > 128)
            return false;

        boolean[] visitedCharacter = new boolean[128];

        for (char c: s.toCharArray()) {
            if (visitedCharacter[c])
                return false;
            visitedCharacter[c] = true;
        }
        return true;
    }

    public static boolean isUnique2 (String s) {
        // No Additional space
        // considering all characters in input string are in ASCII
        // considering only 26 lowercase english characters
        if (s == null || s.isEmpty())
            return true;

        int checked = 0;

        for (char c: s.toCharArray()) {
            if ((checked & (1 << c-'a')) > 0)
                return false;
            checked |= (1 << c-'a');
        }
        return true;
    }
}
