/*
Date:20/02/2023
Problem Statement
Let xyz denote the 3- digit integer whose digits are x, y, and z from left to right.
Given a 3-digit integer, abc none of whose digits is 0, find abc+bca+cab.
Input
The input is given as follows.
abc

Constraints
abc is a 3- digit integer, none of whose digits is 0.
Output
Print the answer.
Example
Sample Input 1
123
Sample Output 1
666

Sample Input 2
999
Sample Output 2
2997
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        while (n > 0) {
            int t = n % 10;
            n = n / 10;
            result = result + t * 100 + t * 10 + t;
        }
        System.out.println(result);
    }
}
