/*
Date:24/01/2023
Problem Statement
Bob is at the origin of a number line. He wants to reach a goal at coordinate X.
There is a wall at coordinate Y, which Bob cannot go beyond at first. However, after picking up a hammer at coordinate Z, he can destroy that wall and pass through.
Determine whether Bob can reach the goal. If he can, find the minimum total distance he needs to travel to do so.
Input
The input is given from Standard Input in the following format:

X Y Z

Constraints
−1000≤X, Y, Z≤1000
X, Y, and Z are distinct, and none of them is 0.
All values in the input are integers.
Output
If Bob can reach the goal, print the minimum total distance he needs to travel to do so. If he cannot, print -1 instead.
Example
Sample Input 1
10 -10 1
Sample Output 1
10

Sample Input 2
20 10 -10
Sample Output 2
40
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if(y<0){
            x = -x;
            y = -y;
            z = -z;
        }

        if(x < y){
            System.out.println(Math.abs(x));
        }else {
            if(z>y){
                System.out.println("-1");
            }else {
                System.out.println(Math.abs(z)+Math.abs(x-z));
            }
        }
    }
}
