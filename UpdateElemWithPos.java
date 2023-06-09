/*
Implement a program to update an element in the given array based on position

Input Format

size,array elements and element to be updated and location

Constraints

no

Output Format

return array after updating

Sample Input 0

5
1 2 3 4 5
2
999
Sample Output 0

1 2 999 4 5
Sample Input 1

5
1 2 3 4 5
0
888
Sample Output 1

888 2 3 4 5

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
        int val=sc.nextInt();
        for(i=0;i<n;i++){
            a[m]=val;
            System.out.print(a[i]+" ");
        }
    }
}
