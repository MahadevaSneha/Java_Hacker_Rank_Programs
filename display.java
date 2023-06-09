/*
Implement a program to read user name and display welcome message on the console.

Input Format

read user name

Constraints

no

Output Format

print message in the following form

welcome name

Sample Input 0

admin
Sample Output 0

welcome admin
Sample Input 1

prakash
Sample Output 1

welcome prakash
Sample Input 2

prakash babu
Sample Output 2

welcome prakash babu


*/




import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("welcome "+s);
    }
}
