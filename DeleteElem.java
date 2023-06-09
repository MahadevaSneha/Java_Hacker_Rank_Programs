/*
Implement a program to delete an element from an array at the position

Input Format

size,array elements and position

Constraints

no

Output Format

return array after deleting from the location

Sample Input 0

5
1 2 3 4 5
2
Sample Output 0

1 2 4 5
Sample Input 1

5
11 22 33 44 55
1
Sample Output 1

11 33 44 55
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[a.length-1];
            int j=0;
            for(i=0;i<a.length;i++){
            if(m!=i)
                b[j++]=a[i];
            else
                continue;
        }
        for(i=0;i<n-1;i++){
             System.out.print(b[i]+" ");
        }
    }
}
