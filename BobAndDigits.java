/*
Date:05/01/2023
Problem Statement
Bob loves to play with numbers. He has an integer N. Find the number of digits that N has in base K.
Input
The input contains two space-separated integers in the following format:
N K

Constraints
All values in the input are integers.
1 ≤ N ≤ 109
2 ≤ K ≤ 10
Output
Print the number of digits that N has in base K.
Example
Sample Input 1
11 2
Sample Output 1
4

Sample Input 2
1010101 10
Sample Output 2
7

Sample Input 3
314159265 3
Sample Output 3
18
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int c=0;
        while(N>=1){
            int rem=N%K;
            c=c+1;
            N=N/K;
        }
        System.out.println(c);
    }
}
