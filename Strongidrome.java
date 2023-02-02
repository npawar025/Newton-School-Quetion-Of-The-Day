/*
Date:15/01/2023
Problem Statement
A string S of an odd length is said to be a strong palindrome if and only if all of the following conditions are satisfied:

1) S is a palindrome.
2) Let N be the length of S. The string formed by the 1- st through ((N−1)/2)- th characters of S is a palindrome.
3) The string consisting of the (N+3)/2- st through N- th characters of S is a palindrome.

Determine whether S is a strong palindrome.
Input
The first and the only line of the input contains a single string S.

Constraints:
3 ≤ |S| ≤ 99
Output
If S is a strong palindrome, print "Yes"; otherwise, print "No".
Example
Sample Input 1:
akasaka

Sample Output 1:
Yes

Sample Explanation 1:
1) S is akasaka.
2) The string formed by the 1- st through the 3- rd characters is aka.
3) The string formed by the 5- th through the 7- th characters is aka. All of these are palindromes, so S is a strong palindrome.


Sample Input 2:
level

Sample Output 2:
No
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		String sub1 = str.substring(0, n/2);
		String sub2 = str.substring(((n+3)/2) -1 ,n );
		if (sub1.equals(sub2)) 
		    System.out.println("Yes");
		else 
		    System.out.println("No");
    }
}
