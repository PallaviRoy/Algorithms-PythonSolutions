package cracking_the_coding_interview.chapter_1_arrays_and_strings;

/*
Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).
* */

public class Q6_StringCompression {

    public String compress (String s) {
        if (s == null)
            return s;

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int index = 0; index < s.length()-1; index++) {
            if (s.charAt(index+1) != s.charAt(index) || index+1 >= s.length()) {
                sb.append(s.charAt(index));
                sb.append(count);
                count = 1;
            }
            else
                count++;
        }
        return sb.length() < s.length() ? sb.toString() : s;
    }

    public static void main(String[] args) {
        Q6_StringCompression q6 = new Q6_StringCompression();
        System.out.println(q6.compress("aabcccccaaa"));
    }
}
