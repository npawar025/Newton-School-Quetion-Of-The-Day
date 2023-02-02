/*
Date:02/02/2023
Problem Statement
You are given positive integers A and B.
Let us calculate A+B (in decimal). If it does not involve a carry, print Easy; if it does, print Hard.
Input
The input contains two space separated numbers:
A B

Constraints
A and B are integers.
1 ≤ A, B ≤ 10^18
Output
If the calculation does not involve a carry, print Easy; if it does, print Hard.
Example
Sample Input 1
229 390
Sample Output 1
Hard

Sample Input 2
123456789 9876543210
Sample Output 2
Easy
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();

        while(a != 0 && b != 0) {
            if((a % 10) + (b % 10) >= 10) {
                System.out.print("Hard");
                return;
            }
            a = a / 10;
            b = b / 10;
        }
        System.out.print("Easy");
    }
}
