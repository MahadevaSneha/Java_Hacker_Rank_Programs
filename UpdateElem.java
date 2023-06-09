/*
Implement a program to update an element in the given array

Input Format

size,array elements and element to be updated (old element & new element)

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

1 999 3 4 5
Sample Input 1

5
1 2 3 4 5
1
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
        int ind=sc.nextInt();
        int val=sc.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==ind){
                a[i]=val;
               // System.out.print(a[i]+" ");
            }
                System.out.print(a[i]+" ");

        }
    }
}
