/*
Date:17/01/2023
Problem Statement
The students of Newton School threw a grand party to celebrate their hard work and achievements. They danced and sang the night away, enjoying delicious food and creating memories that would last a lifetime.
There are N guests in the party and N-1 relationships are given. The guests are numbered 1, 2,. , N. The i- th relationship depicts that guest ai and guest bi are friends.
Determine whether a guest exists or not who is a friend of all other guests.
Here, we only consider the direct friendship.
Input
Input is given from Standard Input in the following format:

N

a1 b1
a2 b2
a3 b3
.
.
.
.
an-1 bn-1


Constraints
3 ≤ N ≤ 10^5
1 ≤ ai, bi ≤ N
i≤N
Output
If a guest exists or who is a friend of all other guests, print "Yes" else print "No".
Example
Sample Input 1
5
1 4
2 4
3 4
4 5

Sample Output 1
Yes

Sample Input 2
4
2 4
1 4
2 3

Sample Output 2
No

Sample Input 3
10
3 10
4 10
9 10
1 10
7 10
5 10
2 10
8 10
6 10

Sample Output 3
Yes
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int friends [][] = new int[n-1][2];
        for(int i = 0; i < n-1; i++){
                friends[i][0] = sc.nextInt();
                friends[i][1] = sc.nextInt();
        }
        boolean result = findCommon(friends,n-1,2);
        if(result){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
    public static boolean findCommon(int mat[][],int M,int N) {

        HashMap<Integer, Integer> cnt = new HashMap<Integer, Integer>();
  
        int i, j;
  
        for (i = 0; i < M; i++) {

            if(cnt.containsKey(mat[i][0])){
                cnt.put(mat[i][0], 
                cnt.get(mat[i][0]) + 1);
            }else{
            cnt.put(mat[i][0], 1);
            }

            for (j = 1; j < N; j++) {
  
                if (mat[i][j] != mat[i][j - 1])
                    if(cnt.containsKey(mat[i][j])){
                        cnt.put(mat[i][j], 
                        cnt.get(mat[i][j]) + 1);
                    }else{
                        cnt.put(mat[i][j], 1);
                    }
            }
        }
  
        for (Map.Entry<Integer, Integer> ele : cnt.entrySet()) {
            if (ele.getValue() == M)
                return true;
        }
        return false;
    }
}
