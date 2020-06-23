/*

The program must accept N integers from 1 to N in any order as the input. The program must print the minimum
number of swaps required to order those N integers in ascending order as the output.

Example Input/Output 1:
Input:
5
2 3 1 5 4
Output:
3
Explanation:
The integers 5 and 4 can be swapped.
Now the integers become 2 3 1 4 5.
Then the integers 2 and 1 can be swapped.
Now the integers become 1 3 2 4 5.
Then the integers 3 and 2 can be swapped.
Now the integers become 1 2 3 4 5.
So at least 3 swaps are required.Hence 3 is printed.

Example Input/Output 2:
Input:
7
2 7 6 3 5 4 1
Output:
4

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j,ans = 0;
		n = sc.nextInt();
		int[] arr = new int[n+1];
		boolean[] visited = new boolean[n+1];
		for(i=1;i<=n;i++){
		    arr[i] = sc.nextInt();
		}
		for(i=0;i<=n;i++){
		    if(visited[arr[i]]){
		        continue;
		    }
		    if(arr[i] == i){
		        visited[arr[i]] = true;
		        continue;
		    }
		    int edges = 0,cycleIndex = i;
		    while(!visited[arr[cycleIndex]]){
		        visited[arr[cycleIndex]] = true;
		        edges++;
		        cycleIndex = arr[cycleIndex];
		    }
		    ans +=edges-1;
		}
        System.out.println(ans);
	}
}
