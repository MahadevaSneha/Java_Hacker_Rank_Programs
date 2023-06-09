/*
Implement a program to insert an element into an array at the first position

Input Format

size,array elements and element to be inserted

Constraints

no

Output Format

return array after insertion

Sample Input 0

5
1 2 3 4 5
8
Sample Output 0

8 1 2 3 4 5
Sample Input 1

4
1 2 3 4
55
Sample Output 1

55 1 2 3 4
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
        int c=sc.nextInt();
        System.out.print(c+" ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    
    }
}
