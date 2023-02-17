/*
Date:17/02/2023
Problem Statement
There are N positive integers written on a blackboard: A1,. , AN.
Edward can perform the following operation when all integers on the blackboard are even:

Replace each integer X on the blackboard by X divided by 2.
Find the maximum possible number of operations that Edward can perform.
Input
The input consists of an integer N and N space separated integers.
N
A1 A2. . AN

Constraints
1≤N≤200
1≤Ai≤10^9
Output
Print the maximum possible number of operations that Edward can perform.
Example
Sample Input 1
3
8 12 40
Sample Output 1
2

Sample Input 2
4
5 6 8 10
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
        int n = sc.nextInt();
		    int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
		
		boolean flag = true;
		int ans = 0;
		while (flag == true) {
			
			for (int i=0; i<n; i++) {
				if (a[i] % 2 == 1) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				ans++;
				for (int i=0; i<n; i++) {
					a[i] /= 2;
				}
			}
			
		}
		
		System.out.println(ans);
		
    }
}
