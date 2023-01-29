/*
Date:29/01/2023
Problem Statement
Alexa loves to play with strings. She is given a string S consisting of lowercase English letters.
If 'a' appears in S, print the last index at which it appears; otherwise, print −1. (The index starts at 1. )
Input
The input contains only one string.
S

Constraints
1 <= |S| <= 100
Output
Print the answer.
Example
Sample Input 1
abcdaxayz
Sample Output 1
7

Sample Input 2
bcbbbz
Sample Output 2
-1
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = s.lastIndexOf('a')+1;
        if(index == 0){
            System.out.print(-1);
        } else {
            System.out.print(index);
        }
    }
}
