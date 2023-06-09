/*
Given an integer array and an integer N denoting the array length as input. your task is to return the sum of third largest and second minimum elements of the array.

Input Format

array size and array elements

Constraints

no

Output Format

an int value

Sample Input 0

5
5 3 2 1 4
Sample Output 0

5
Sample Input 1

6
12 45 100 250 300 450
Sample Output 1

295
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
        Arrays.sort(a);
        System.out.print(a[1]+a[n-3]);
    }
}
