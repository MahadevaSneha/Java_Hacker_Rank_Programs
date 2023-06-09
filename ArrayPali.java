/*
Implement a program to check whether an array is paliandrome or not.

Input Format

Array size N and Array Elements

Constraints

no

Output Format

true or false

Sample Input 0

5
1 2 3 2 1
Sample Output 0

true
Sample Input 1

4
10 11 12 13
Sample Output 1

false
*/
import java.io.*;
import java.util.*;

public class Solution {
public static boolean isPali(int a[]){
    int b[]=new int[a.length];
    for(int i=0;i<a.length;i++){
        b[i]=a[i];
    }
        for(int i=0;i<a.length;i++)
            if(a[i]==b[a.length-1-i]){
            return true;
            }
            return false;
}
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(isPali(a));
    }
}
