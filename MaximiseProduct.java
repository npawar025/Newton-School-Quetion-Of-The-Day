/*
Date:13/02/2023
Problem Statement
Given are integers a, b, c, and d. If x and y are integers and a≤x≤b and c≤y≤d hold, what is the maximum possible value of x*y?
Input
The input consists of four space-separated integers.
a b c d

Constraints
−10^9≤a≤b≤10^9
−10^9≤c≤d≤10^9

All values in the input are integers.
Output
Print the maximum product.
Example
Sample Input 1
1 2 1 1
Sample Output 1
2

Sample Input 2
3 5 -4 -2
Sample Output 2
-6

Sample Input 3
-1000000000 0 -1000000000 0
Sample Output 3
1000000000000000000
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
 
        long max1 = a * d;
        long max2 = b * c;
        long MAX1 = Math.max(max1,max2);
 
        long max3 = a * c;
        long max4 = b * d;
        long MAX2 = Math.max(max3,max4);
 
        System.out.println(Math.max(MAX1,MAX2));
    }
}
