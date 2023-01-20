/*
Date: 18/01/2023
Problem Statement
Edward participated in one maths competition. He was asked to find the number of ways to choose a pair of an even number and an odd number from the positive integers between 1 and N (inclusive). The order does not matter.
Input
The input line contains only one input N.

Constraints
2≤N≤100
N is an integer.
Output
Print the number of ways to choose a pair of an even number and an odd number from the positive integers between 1 and N (inclusive).
Example
Sample Input 1
3

Sample Output 1
2

Sample Input 2
6

Sample Output 2
9

Sample Input 3
11

Sample Output 3
30
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int even = (N % 2 == 0) ? (N / 2): ((N + 1) / 2);
        int odd = N - even;

        int ans = even * odd;
        System.out.print(ans);
    }
}
