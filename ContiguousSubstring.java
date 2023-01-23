/*
Date:23/01/2023
Problem Statement
You are given strings S and T consisting of lowercase English letters. Determine whether T is a (contiguous) substring of S.

A string Y is said to be a (contiguous) substring of X if and only if Y can be obtained by performing the operation below on X zero or more times.

Do one of the following.
i) Delete the first character in X.
ii) Delete the last character in X.
For instance, the tag is a (contiguous) substring of voltage, while ace is not a (contiguous) substring of atcoder.
Input
The input is given from Standard Input in the following format:
S
T

Constraints
S and T consist of lowercase English letters.
1≤∣S∣, ∣T∣≤100 (∣X∣ denotes the length of a string X. )
Output
If T is a (contiguous) substring of S, print Yes; otherwise, print No.
Example
Sample Input 1
voltage
tag
Sample Output 1
Yes

Sample Input 2
gorilla
gorillagorillagorilla
Sample Output 2
No
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int slen=s.length();
        int tlen=t.length();
        
        if(slen<tlen) {
        	System.out.println("No");
        	return;
        }
        for(int i=0;i<=slen-tlen;i++) {
        	String str = s.substring(i,i+tlen);
        	if(str.equals(t)) {
        		System.out.println("Yes");
        		return;
        	}
        }
        System.out.println("No");
    }
}
