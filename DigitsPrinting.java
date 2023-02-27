/*
Problem Statement
You are given an integer N of at least 100. Print the last two digits of N. Strictly speaking, print the tens and one's digits of N in this order.
Input
The input consists of an integer.
N

Constraints
100≤N≤999
N is an integer.
Output
Print the answer.
Example
Sample Input 1
254
Sample Output 1
54

Sample Input 2
101
Sample Output 2
01
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = N % 100;
 
        System.out.println(String.format("%02d", M));
    }
}

/*
String s = sc.next();
        for(int i = 1; i < s.length(); i++){
            System.out.print(s.charAt(i));
        }
*/
