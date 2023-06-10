/*
Implement a program to find sum of even indexed rows in the given matrix.

Input Format

a 3x3 matrix

Constraints

no

Output Format

sum as an int

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

30
Sample Input 1

1 0 0
0 1 0
0 0 1
Sample Output 1

2

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int i=0;
        int j=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(j%2==0){
                    sum=sum+a[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
