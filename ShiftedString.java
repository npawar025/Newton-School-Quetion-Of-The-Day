/*
Date: 07/02/2023
Problem Statement
We have a string S consisting of uppercase English letters. Additionally, an integer N will be given.
Shift each character of S by N in alphabetical order (see below), and print the resulting string.

We assume that A follows Z. For example, shifting A by 2 results in C (A → B → C), and shifting Y by 3 results in B (Y → Z → A → B).
Input
The input contains a number and a string separated by a new line.

N
S
Output
Print the string resulting from shifting each character of S by N in alphabetical order
Example
Sample Input 1
2
ABCXYZ
Sample Output 1
CDEZAB

Sample Input 2
0
ABCXYZ
Sample Output 2
ABCXYZ

Sample Input 3
13
ABCDEFGHIJKLMNOPQRSTUVWXYZ
Sample Output 3
NOPQRSTUVWXYZABCDEFGHIJKLM
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < S.length(); ++i){
            if((char)(S.charAt(i) + N) > 'Z'){
                s.append((char) ((S.charAt(i) + N) - 26));
            }else s.append((char) (S.charAt(i) + N));
        }
        System.out.print(s);
    }
}
