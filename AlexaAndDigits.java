/*
Date:14/02/2023
Problem Statement
Having learned the multiplication table, Alexa can multiply two integers between 1 and 9 (inclusive) together. Given an integer N, determine whether N can be represented as the product of two integers between 1 and 9. If it can, print Yes; if it cannot, print No.
Input
The input consists of a single integer.
N

Constraints
1≤N≤100
Output
If N can be represented as the product of two integers between 1 and 9 (inclusive), print Yes; if it cannot, print No.
Example
Sample Input 1
10
Sample Output 1
Yes

Sample Input 2
50
Sample Output 2
No

Sample Input 3
81
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
        int n = sc.nextInt();
        
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                if(i * j == n){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
