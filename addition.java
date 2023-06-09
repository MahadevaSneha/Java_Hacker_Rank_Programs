/*
Implement a program to read two integer values from the user and perform addition operation.

Input Format

two integer values

Constraints

no

Output Format

an integer value on the console

Sample Input 0

1
2
Sample Output 0

3
Sample Input 1

10
11
Sample Output 1

21
Sample Input 2

5
5
Sample Output 2

10

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(n+m);
    }
}
