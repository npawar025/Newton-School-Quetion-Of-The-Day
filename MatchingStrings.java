/*
Date: 22/01/2023
Problem Statement
You are given two strings S and T. Determine whether it is possible to make S and T equal by doing the following operation at most once:

Choose two adjacent characters in S and swap them.

Note that it is allowed to choose not to do the operation.
Input
The input line contains two strings in separate lines.

Constraints
Each of S and T is a string of length between 2 and 100 (inclusive) consisting of lowercase English letters.
S and T have the same length.
Output
If it is possible to make S and T equal by doing the operation in Problem Statement at most once, print Yes; otherwise, print No.
Example
Sample Input 1
abc
acb

Sample Output 1
Yes

Sample Input 2
aabb
bbaa

Sample Output 2
No

Sample Input 3
abcde
abcde

Sample Output 3
Yes
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        if(S.equals(T)){
            System.out.println("Yes");
            return;
        }
        char[] s = S.toCharArray();
        for(int i=0; i<s.length-1; i++) {
            char tmp = s[i];
            s[i] = s[i+1];
            s[i+1] = tmp;
            String stmp = new String(s);
            if(stmp.equals(T)){
                System.out.println("Yes");
                return;
            }
            tmp = s[i];
            s[i] = s[i+1];
            s[i+1] = tmp;
        }
        System.out.println("No");
    }
}
