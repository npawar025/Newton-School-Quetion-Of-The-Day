/*
Date:01/02/2023
Problem Statement
You are given integers L, R, and a string S consisting of lowercase English letters.
Print this string after reversing (the order of) the L-th through R-th characters.
Input
The input line contains L and R separated by space. The next line S
L R
S

Constraints
S consists of lowercase English letters.
1≤ |S| ≤ 10^5 (|S| is the length of S. )
L and R are integers.
1 ≤ L ≤ R ≤ |S|
Output
Print the specified string.
Example
Sample Input 1
3 7
abcdefgh
Sample Output 1
abgfedch

Sample Input 2
1 7
reviver
Sample Output 2
reviver

Sample Input 3
4 13
merrychristmas
Sample Output 3
meramtsirhcyrs

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt() - 1;
        int r = sc.nextInt() - 1;
        String str = sc.next();
        int len = str.length();
 
        System.out.println(reverse(str.toCharArray(), len, l, r));
    }

    public static String reverse(char[] str, int len, int l, int r) {
 
        if (l < 0 || r >= len || l > r)
            return "";
            
        while (l < r) {
            char c = str[l];
            str[l] = str[r];
            str[r] = c;
 
            l++;
            r--;
        }
        String string = new String(str);
        return string;
    }
}
