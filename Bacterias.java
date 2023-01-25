/*
Date: 25/01/2023
Problem Statement
There are A Bacterias.
Each time Jerry shouts, the bacterias multiply by K times.
In order to have B or more slimes, at least how many times does Jerry need to shout?
Input
Input is given from Standard Input in the following format:
A B K

Constraints
1≤A≤B≤10^9
2≤K≤10^9
All values in input are integers.
Output
Print the answer.
Example
Sample Input 1
1 4 2
Sample Output 1
2

Sample Input 2
7 7 10
Sample Output 2
0

Sample Input 3
31 415926 5
Sample Output 3
6
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        long count = 0;

        while(A < B){
            A *= K;
            count++;
        }

        System.out.print(count);
    }
}
