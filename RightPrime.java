/*
Date:13/01/2023
Problem Statement
Find the minimum prime number greater than or equal to X.
Input
The only line of the input contains a single integer X

Constraints:
2 ≤ X ≤ 105
Output
Print the answer
Example
Sample Input 1:
20

Sample Output 1:
23

Sample Explanation 1:
The minimum prime number greater than or equal to 20 is 23.


Sample Input 2:
99992

Sample Output 2:
100003


Sample Input 3:
2

Sample Output 3:
2
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(nextPrime(n));
    }
    public static long nextPrime(long n) {
        long sq = (long)Math.sqrt(n);
        boolean flag = true;
        for(int i = 2; i < sq; i++){
            if(n%i == 0) {
                flag = false;
                break;
            }
        }
        if(flag) return n;
        else return nextPrime(n + 1);
    }
}
