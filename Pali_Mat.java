/*
Implement a program to keep all pali numbers as it is and replace remaining with 0.

Input Format

a 3x3 matrix

Constraints

no

Output Format

result matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

1 2 3
4 5 6
7 8 9
Sample Input 1

111 122 133
141 151 168
888 567 999
Sample Output 1

111 0 0
141 151 0
888 0 999
Submissions: 39
Max Score: 1
Difficulty: Medium
Rate This Challenge:

    
More

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int r[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int m=0,re=0;
                int n=a[i][j];
                while(n!=0){
                    m=n%10;
                    re=re*10+m;
                    n=n/10;
                }
                if(a[i][j]==re){
                    r[i][j]=a[i][j];
                }
                else{
                    a[i][j]=0;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
