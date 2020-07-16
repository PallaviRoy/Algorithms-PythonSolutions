package cracking_the_coding_interview.chapter_1_arrays_and_strings;

/*
* Q. Write a method to replace all spaces in a string with '%2e: You may assume that the string
* has sufficient space at the end to hold the additional characters, and that you are given the "true"
* length of the string. (Note: if implementing in Java, please use a character array so that you can
* perform this operation in place.)
*/

import java.util.stream.Stream;

public class Q3_URLify {

 public void replaceSpaces (char[] str, int trueLength) {
     if (str == null || str.length == 0)
         return;

     Stream.of(str).forEach(System.out::println);

     if (str.length > trueLength) str[trueLength] = '\0';

     int spaceCount = 0;

     for (char c: str) {
         if (c == ' ')
             spaceCount++;
         if (c == '\0')
             break;
     }

     int writePtr = trueLength + (spaceCount * 2) - 1; // hello world -> hello%20world

     for (int readPtr = trueLength - 1; readPtr >= 0; readPtr--) {
         if (str[readPtr] == ' ') {
             str[writePtr] = '0';
             str[writePtr-1] = '2';
             str[writePtr-2] = '%';
             writePtr -= 3;
         }
         else {
             str[writePtr] = str[readPtr];
             writePtr--;
         }
     }

     Stream.of(str).forEach(System.out::println);
 }

}
