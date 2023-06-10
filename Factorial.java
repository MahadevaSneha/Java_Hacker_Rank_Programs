/*
Implement a program to find factorial of the given number.

Input Format

an integer value from the user

Constraints

no

Output Format

factorial value

Sample Input 0

5
Sample Output 0

120
Sample Input 1

0
Sample Output 1

1
Sample Input 2

1
Sample Output 2

1

*/
import java.io.*;
import java.util.*;

public class Solution {
    public static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=fact(n);
        System.out.println(s);
    }
}
