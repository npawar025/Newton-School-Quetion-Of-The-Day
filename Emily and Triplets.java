/*
Date - 20/01/2023
Problem Statement
Emily was playing with triplets. She was excited to find out how many triples of non-negative integers (a, b, c) satisfy a+b+c≤S and a×b×c≤T, where S & T are non-integers.
Input
The input line contains S, and T separated by space.

Constraints
0≤S≤100
0≤T≤10000
S and T are integers.
Output
Print the number of triples of non-negative integers (a, b, c) satisfying the conditions.
Example
Sample Input 1
1 0

Sample Output 1
4

Sample Input 2
2 5

Sample Output 2
10

Sample Input 3
10 10

Sample Output 3
213
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int T = sc.nextInt();
        int cnt = 0;
        for(int a = 0; a <= S; a++){
            for(int b = 0; a+b <= S; b++){
                for(int c = 0; a+b+c <= S; c++){
                    if(a*b*c <= T) 
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
