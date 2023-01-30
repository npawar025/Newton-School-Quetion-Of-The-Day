/*
Date:30/01/2023
Problem Statement
There was an exam consisting of three problems worth 1, 2, and 4 points.
Alexa, Edward, and Bob took this exam. Alexa scored A points, and Edward scored B points.

Bob solved all of the problems solved by at least one of Alexa and Edward and failed to solve any of the problems solved by, neither of them.

Find Bob's score.
It can be proved that Bob's score is uniquely determined under the Constraints of this problem.
Input
The input contains two integers separated by a space
A B

Constraints
0≤A, B≤7
A and B are integers.
Output
Print Bob's score as an integer.
Example
Sample Input 1
1 2
Sample Output 1
3

Sample Input 2
5 3
Sample Output 2
7

Sample Input 3
0 0
Sample Output 3
0
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int score = a | b;
        System.out.println(score);
    }
}
