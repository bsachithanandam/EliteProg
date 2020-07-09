/*

There are N stones arranged in a row. Each stone has a positive value, which indicates the maximum number of stones a person can cross in one jump from it. A person always starts from the first stone and he wants to reach the
final or last stone. The program must accept N integers representing the N stones as the input. The program must
print the minimum number of jumps that the person can reach to the last stone as the output.

Boundary Condition(s):
1 <= N <= 10^5
1 <= Each integer value <= 10^3

Input Format:
The first line contains N.
The second line contains N integers separated by a space.

Output Format:
The first line contains the minimum number of jumps that the person can reach to the last stone.

Example Input/Output 1:
Input:
5
2 3 1 1 4
Output:
2
Explanation:
Here the minimum number of jumps that the person can reach to the last stone is 2.
In the 1 jump, he can jump from 2 to 3 (i.e., from the 1 stone to the 2 stone).
In the 2 jump, he can jump from 3 to 4 (i.e., from the 2 stone to the 5 stone).

Example Input/Output 2:
Input:
14
1 3 5 3 3 1 1 1 1 1 1 1 1 4
Output:
9

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1){
		    System.out.println("Ans is:"+0);
		    return ;
		}
		int a[] = new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int jumps =1,maxReach=a[0],steps = a[0];
		for(int i =1;i<n;i++){
		    if(i==n-1){
		        break;
		    }
		    if(i+a[i]>maxReach){
		        maxReach = i+a[i];
		    }
		    steps--;
		    if(steps==0){
		        jumps++;
		        steps = maxReach-i;
		    }
		}
        System.out.println("ans is: "+jumps)
	}
}
