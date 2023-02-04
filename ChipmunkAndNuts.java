/*
Date:04/01/2023
Problem Statement
There are N trees. The ith tree bears Ai nuts. Chipmunk will harvest nuts from the trees in the following manner:
From a tree with 10 or fewer nuts, she does not take nuts.
From a tree with more than 10 nuts, she takes all but 10 nuts.
Find the total number of nuts Chipmunk will take from the trees.
Input
Input is given from Standard Input in the following format:
N
A1… AN

Constraints
1 ≤ N ≤ 1000
0 ≤ Ai ≤ 1000
All values in the input are integers.
Output
Print the answer.
Example
Sample Input 1
3
6 17 28
Sample Output 1
25

Sample Input 2
4
8 9 10 11
Sample Output 2
1
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tree[] = new int[n];
        for(int i =0; i < n; i++){
            tree[i] = sc.nextInt();
        }
        int totalNuts = 0;
        for(int i = 0; i < n; i++){
            if(tree[i] > 10){
                totalNuts += (tree[i] - 10);
            }
        }
        System.out.print(totalNuts);
    }
}
