/*
Date:28/01/2023
Problem Statement
You are given a sequence of length N consisting of integers:
A=(A1, A2,...., AN)
Find the smallest non-negative integer not in (A1, A2,....,AN).
Input
The input contains N and elements of sequence separated by a new line.
N
A1, A2,. , AN

Constraints
1≤N≤2000
0≤Ai≤2000
All values in the input are integers.
Output
Print the answer.
Example
Sample Input 1
8
0 3 2 6 2 1 0 0
Sample Output 1
4

Sample Input 2
3
2000 2000 2000
Sample Output 2
0
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int k=0;
        Collections.sort(list);
        while(k<n){
            if(!list.contains(k)){
                break;
            }
            k++;
        }
        System.out.println(k);
    }
}
