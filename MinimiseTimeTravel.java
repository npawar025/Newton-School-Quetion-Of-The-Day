/*
Date:18/02/2023
Problem Statement
There are three airports A, B, and C, and flights between each pair of airports in both directions.
A one-way flight between airports A and B takes P hours, a one-way flight between airports B and C takes Q hours, and a one-way flight between airports C and A takes R hours. Consider a route where we start at one of the airports, fly to another, and then fly to the other.
What is the minimum possible sum of the flight times?
Input
The input consists of three space separated integers.
P Q R

Constraints
1≤P, Q, R≤100
All values in input are integers.
Output
Print the minimum possible sum of the flight times.
Example
Sample Input 1
1 3 4
Sample Output 1
4

Sample Input 2
3 2 3
Sample Output 2
5
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[3];
        for(int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = a[0] + a[1];
        System.out.print(ans);
    }
}
