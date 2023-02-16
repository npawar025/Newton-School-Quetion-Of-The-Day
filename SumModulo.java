/*
Date:16/02/2023
Problem Statement
Let S(n) denote the sum of the digits in the decimal notation of n. For example, S(101)=1+0+1=2.
Given an integer N, determine if S(N) divides N.
Input
The input consists of a single integer.
N

Constraints
1≤N≤10^9
Output
If S(N) divides N, print Yes; if it does not, print No.
Example
Sample Input 1
12
Sample Output 1
Yes

Sample Input 2
101
Sample Output 2
No

Sample Input 3
999999999
Sample Output 3
Yes
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int x = n;
        int d = 0;
        int sum = 0;
        
        while(n>0){
            d = n % 10;
            n = n / 10;
            sum = sum + d;
        }

        if(x % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
