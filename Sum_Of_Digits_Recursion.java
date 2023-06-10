/*
Implement a program to find sum of n natural numbers.

Input Format

an integer value

Constraints

no

Output Format

sum of natural numbers

Sample Input 0

5
Sample Output 0

15
Sample Input 1

4
Sample Output 1

10

*/
import java.io.*;
import java.util.*;

public class Solution {
        public static int sumOfNaturalNumbers(int n){
            if(n==0)
                return 0;
            return n+sumOfNaturalNumbers(n-1);
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOfNaturalNumbers(n));
    }
}
