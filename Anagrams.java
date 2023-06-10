/*
Two strings a and b are called anagrams, if they contain all the same characters in the same frequencies.

Input Format

two strings a and b

Constraints

no

Output Format

true or false

Sample Input 0

anagram
margana
Sample Output 0

true
Sample Input 1

python
java
Sample Output 1

false
*/
import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Solution {
        public static boolean anagrams(String s,String s1){
            char ch1[]=s.toCharArray();
            char ch2[]=s1.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
        } 
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        
        System.out.println(anagrams(s,s1));
    }
}
