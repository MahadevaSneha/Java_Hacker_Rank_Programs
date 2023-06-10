/*
Implement a program to swap two given rows.

Input Format

matrix and m and n values

Constraints

no

Output Format

modified matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
1
2
Sample Output 0

4 5 6
1 2 3
7 8 9
Sample Input 1

1 0 0
0 1 0
0 0 1
1
2
Sample Output 1

0 1 0
1 0 0
0 0 1
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            a[i][j]=sc.nextInt();
            }
        }
        int n=sc.nextInt();
        int m=sc.nextInt();
        int t;
        for(int i=0;i<3;i++){
            t=a[n-1][i];
            a[n-1][i]=a[m-1][i];
            a[m-1][i]=t;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
