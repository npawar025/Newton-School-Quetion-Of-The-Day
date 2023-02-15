/*
Date:06/01/2023
Problem Statement
Newton has shifted to a new house and it came to his notice that there is only one socket in his house !!!
Newton does a lot of experiments using electricity and wants at least B sockets in his house.
Furthermore, he has an ample amount of extension cords and each extension has A sockets and takes one socket. In others words, an extension cord extends one socket into A sockets. You need to tell Newton how many extension cords will be required so that he can have at least B sockets.
Input
The first and the only line of the input contains 2 single integers A and B

Constraints:
1) 2 ≤ A ≤ 200
2) 1 ≤ B ≤ 200
Output
Print the answer
Example
Sample Input 1:
4 10

Sample Output 1:
3

Sample Input 2:
8 9

Sample Output 2:
2

Explanation 1:
3 power strips, each with 4 sockets, extend the socket into 10 empty sockets.

*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        if(A>2){
            ans=B/(A-1);
            if(B%(A-1)>1){
                ans++;
            }
        }
        else{
            ans=B-1;
        }
         System.out.println(ans);
    }
}
