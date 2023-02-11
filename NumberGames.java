/*
Date:11/02/2023
Problem Statement
You are given an integer N. Do the following operation K times on it and print the resulting integer.
If N is a multiple of 200, divide it by 200. Otherwise, see N as a string and append 200 to the end of it.
For example, 7 would become 7200, and 1234 would become 1234200.
Input
The input consists of two space separated integers as follows:
N K

Constraints
All values in input are integers.
1≤N≤10^5
1≤K≤20
Output
Print the answer as an integer.
Example
Sample Input 1
2021 4
Sample Output 1
50531

Sample Input 2
40000 2
Sample Output 2
1

Sample Input 3
8691 20
Sample Output 3
84875488281
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            if(N % 200 == 0){
                N /= 200;
            } else {
                N *= 1000;
                N += 200;
            }
        }
        System.out.println(N);
    }
}
