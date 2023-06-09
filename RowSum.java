/*
Write a program to find row wise sum in the matrix.

Input Format

a 3x3 matrix

Constraints

no

Output Format

sum of each row

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

6
15
24
Sample Input 1

1 0 0
0 2 0
0 0 3
Sample Output 1

1
2
3
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int m=3;
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                  sum=sum+a[i][j];
            }
            System.out.println(sum);
        }
    }
}
