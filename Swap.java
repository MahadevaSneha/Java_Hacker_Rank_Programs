/*
Implement a program to convert lower case into upper case and upper case into lower case (swap case)

Input Format

string

Constraints

no

Output Format

toggle case

Sample Input 0

abc
Sample Output 0

ABC
Sample Input 1

Prakash
Sample Output 1

pRAKASH
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String n="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                n=n+Character.toLowerCase(ch);
            }
            else{
                n=n+Character.toUpperCase(ch);
            }
        }
        System.out.println(n);
    }
}
