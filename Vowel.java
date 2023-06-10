/*
Implement a program to read a string and print number of vowels present in string.

Input Format

string

Constraints

no

Output Format

number of vowels

Sample Input 0

hello
Sample Output 0

2
Sample Input 1

welcome
Sample Output 1

3

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
                c++;
            }
        }
        System.out.println(c);
    }
}
