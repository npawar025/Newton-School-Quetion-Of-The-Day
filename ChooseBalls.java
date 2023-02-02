/*
Date:14/01/2023
Problem Statement
We have N+M balls, each of which has an integer written on it.
It is known that:

1) The numbers written on N of the balls are even.
2) The numbers written on M of the balls are odd.

Find the number of ways to choose two of the N+M balls (disregarding order) so that the sum of the numbers written on them is even.
Input
The first and the only line of the input contains 2 space separated integers, N and M

Constraints:
1) 0 ≤ N, M ≤ 100
2) 2 ≤ N + M
Output
Print the answer
Example
Sample Input 1:
2 1

Sample Output 1:
1


Sample Input 2:
4 3

Sample Output 2:
9


Sample Input 3:
13 3

Sample Output 3:
81
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
 
        if (N < 2 && M < 2) {
            System.out.println(0);
        } else {
            int n = N * (N - 1) / 2;
            int m = M * (M - 1) / 2;
            System.out.println(n + m);
 
        }
    }
}
