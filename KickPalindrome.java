/*
Date-29/12/2022
Problem Statement
Newton got a string as a gift on Christmas.

Newton likes palindromes so he decides to make this string into a palindrome.

He can kick the string and after every kick he can change any one of its character to any other character of his choice.

Find the minimum number of times that Newton has to kick the string.
Input
The first and the only line of the input contains a single string S

Constraints:

1 ≤ |S| ≤ 1000

All characters in S are in lowercase and are English letters

Output
Output the answer
Example
Sample Input 1:
newton

Sample Output 1:
2

Sample Explanation 1:
In the first kick, Newton changes the 2nd character to 'o'
In the second kick, Newton changes the 4th character to 'w'.
Thus, the final word is "nowwon" which is a palindrome.


Sample Input 2:
abbcbba

Sample Output 2:
0
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        numberOfKicks(s);
    }
    public static void numberOfKicks(String s) {
 
        int n = s.length();
 
        int count = 0;
 
        for(int i = 0; i < n/2; i++) {
            if(s.charAt(i) != s.charAt(n - i - 1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
