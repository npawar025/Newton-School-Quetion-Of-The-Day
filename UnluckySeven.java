/*
Date:26/01/2023
Problem Statement
Mahi hates the number 7.

We are interested in integers without the digit 7 in both decimal and octal. How many such integers are there between 1 and N (inclusive)?
Input
Input is given from Standard Input in the following format:
N

Constraints
1≤N≤10^5

N is an integer.
Output
Print an integer representing the answer.
Example
Sample Input 1
20
Sample Output 1
17
Sample Input 2
100000
Sample Output 2
30555
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static boolean convert (int base, int i) {
		int x = i;
		while (x > 0) {
			if (x % base == 7) {
				return false;
			}
			x = x / base;
		}
		return true;
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();

        int count = 0;
		for (int i = 1; i <= n; i++) {
			
			if (convert(10, i) && convert(8, i)) {
                count++;
            }
		}
		System.out.println(count);
	}
}
