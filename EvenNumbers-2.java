/*
Date- 19/01/2023
Even Numbers - 2
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton loves EVEN numbers.

You are given two integers N and M. Generate 5 unique even numbers for Newton between N and M (excluding both).
Input
The first and the only line of input contains integer N and integer M.


Constraints
-103 <= N <=M <= 103

M - N > 10
Output
The only line of output contains 5 singly spaced integers satisfying the constraints.
Example
Sample Input
0 20

Sample Output
2 6 8 18 14
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i = N + 1; i < N+11; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
