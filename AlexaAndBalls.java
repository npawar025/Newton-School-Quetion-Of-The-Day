/*
Date:03/02/2023
Problem Statement
There is a container with cyan balls. Alexa will do the following operation as many times as he likes (possibly zero times):
Add B cyan balls and C red balls into the container.
Alexa's objective is to reach a situation where the number of cyan balls in the container is at most D times the number of red balls in it.

Determine whether the objective is achievable. If it is achievable, find the minimum number of operations needed to achieve it.
Input
The input contains 4 space-separated numbers:
A B C D

Constraints
1 ≤ A, B, C, D ≤ 105

All values in the input are integers.
Output
If Alexa's objective is achievable, print the minimum number of operations needed to achieve it. Otherwise, print -1.
Example
Sample Input 1
5 2 3 2
Sample Output 1
2

Sample Input 2
6 9 2 3
Sample Output 2
-1
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        long t=c*d-b;
        if (t<=0) System.out.println(-1);
        else{
            if (a%t==0) System.out.println(a/t);
            else System.out.println(a/t+1);
        }
    }
}
