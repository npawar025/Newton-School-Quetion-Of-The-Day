/*
Date: 21/01/2023
Problem Statement
Abhas likes to play with numbers. He is given integers N and K. Find the number of triples (a, b, c) of positive integers not greater than N such that a+b, b+c, and c+a are all multiples of K. The order of a, b, and c does matter, and some of them can be the same.
Input
The input line contains N and K separated by space.


Constraints
1≤N, K≤2×10^5

N and K are integers.
Output
Print the number of triples (a, b, c) of positive integers not greater than N such that a+b, b+c, and c+a are all multiples of K.
Example
Sample Input 1
3 2

Sample Output 1
9

Sample Input 2
5 3

Sample Output 2
1

Sample Input 3
35897 932

Sample Output 3
114191
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(count(n, k));

    }
    public static long count(int n, int k){
        if(k % 2 == 0){
            long i = n / k;
            long j = (n + (k / 2)) / k;
            return i * i * i + j * j * j;
        } else {
            long i = n / k;
            return i * i * i;
        }
    }
}
