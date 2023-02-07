/*
Date:07/02/2023
Problem Statement
We have 4 cards with an integer 1 written on it, 4 cards with 2, …, 4 cards with N, for a total of 4N cards.
Alexa shuffled these cards, removed one of them, and gave you a pile of the remaining 4N−1 cards. The i- th card (1≤i≤4N−1) of the pile has an integer Ai written on it.

Find the integer written on the card removed by Alexa.
Input
The first line of input contains an integer N.
The second line contains N space separated integers as follows:

N
A1 A2. . AN

Constraints
1≤N≤10^5
1≤Ai≤N(1≤i≤4N−1)
For each k(1≤k≤N), there are at most 4 indices i such that Ai=k.
All values in input are integers.
Output
Print the answer.
Example
Sample Input 1
3
1 3 2 3 3 2 2 1 1 1 2
Sample Output 1
3

Sample Input 2
1
1 1 1
Sample Output 2
1

Sample Input 3
4
3 2 1 1 2 4 4 4 4 3 1 3 2 1 3
Sample Output 3
2
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n+1];
		
		for(int i=1; i<4*n; i++) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == 3) System.out.println(i);
		}
		
 	}
}

//Both solutions are giving me MLE - used buffereader

/*import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n*(n+1)*2;
        for(int i = 0; i < n*4-1; i++){
            ans -= sc.nextInt();
 
        }
        System.out.println(ans);
    }
}
*/

/*
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

		Map<Integer, Integer> map = new HashMap<>();
        
		for (int i = 0; i < 4*N-1; i++) {
			int card = sc.nextInt();
			if (map.get(card) == null) { 
                map.put(card, 1);
            } else {
                map.put(card, map.get(card) + 1);
            }
		}
		
		for (Map.Entry<Integer, Integer> e: map.entrySet()) {
			if (e.getValue() == 3) {
				System.out.println(e.getKey());
			}
        }
    }
}
*/
