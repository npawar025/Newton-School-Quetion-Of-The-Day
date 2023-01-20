/*
Date-30/12/2023
Problem Statement
Newton is given 3 integer T1, T2 and T3.

If T1 + T2 + T3 ≥ 22, print "bust"; otherwise print "win"
Input
The first and the only line of the input contains 3 positive integers T1, T2 and T3.

Constraints:
1 ≤ T1, T2, T3 ≤ 15
Output
Print the answer in a single line
Example
Sample Input 1:
1 2 3

Sample Output 1:
win


Sample Input 2:
10 10 10

Sample Output 2:
bust
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        
        int ans = t1 + t2 + t3;

        if(ans >= 22) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }
    }
}
