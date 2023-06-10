/*
Implement a program to convert the given string into lower case

Input Format

string

Constraints

no

Output Format

string in lower case

Sample Input 0

Prakash
Sample Output 0

prakash
Sample Input 1

abc
Sample Output 1

abc
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
        System.out.println(s.toLowerCase());
    }
}
