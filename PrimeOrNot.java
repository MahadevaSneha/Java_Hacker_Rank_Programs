/*
Implement a program to check whether the given number is prime or not.

Input Format

an integer value

Constraints

no

Output Format

true or false

Sample Input 0

3
Sample Output 0

true
Sample Input 1

6
Sample Output 1

false
Sample Input 2

7
Sample Output 2

true

*/
import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPrime(int n){
         if(n==1 && n<=0)
             return false;
        for(int i=2;i<n;i++)
            if(n%i==0)
                return false;
          return true;  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
    }
}
