/*
Date:27/01/2023
Problem Statement
Alexa Loves to play with 0's and 2's. Among the positive integers that consist of 0's and 2's when written in base 10, he wanted to find the Kth smallest integer. Help him find that.
Input
Input is given from Standard Input in the following format:

K
Output
Print the answer as an integer.
Here, the exact value must be printed as an integer, even if it is big. Unnecessary leading zeros such as 0523 are not allowed.
Example
Sample Input 1
3
Sample Output 1
22

Sample Input 2
11
Sample Output 2
2022

Sample Input 3
923423423420220108
Sample Output 3
220022020000202020002022022000002020002222002200002022002200

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); 
        long K = sc.nextLong();
 
 
        String n = Long.toBinaryString(K);
 
        String ans = "";
        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i) == '1'){
                ans += "2";
            }else{
                ans += "0";
            }
        }
 
        System.out.println(ans);
    }
}
