/*
Date:15/02/2023
Problem Statement
Alexa's house has only one socket.
Alexa wants to extend it with some number of power strips, each with A sockets, into B or more empty sockets. One power strip with A sockets can extend one empty socket into A empty sockets.
Find the minimum number of power strips required.
Input
The input consists of two space separated integers.
A B

Constraints
All values in input are integers.
2≤A≤20
1≤B≤20
Output
Print the minimum number of power strips required.
Example
Sample Input 1
4 10
Sample Output 1
3

Sample Input 2
8 9
Sample Output 2
2

Sample Input 3
8 8
Sample Output 3
1
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
