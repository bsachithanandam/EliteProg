/*
Subarray Sum:

The program must accept an integer array of size N and an integer S as the input. The program must
print Yes if any of the sub-arrays is having the sum of their elements as S. Else the program must print
No as the output.

Boundary Condition(s):
2 <= N <= 10^5
1 <= Each integer value <= 1000

Input Format:
The first line contains N.
The second line contains N integers separated by a space.

Output Format:
The first line contains Yes or No.

Example Input/Output 1:
Input:
5
5 10 50 20 25
45
Output:
Yes
Explanation:
The integers in the sub-array which is having the sum of their elements as 45 are given below.
20 25

Example Input/Output 2:
Input:
6
4 7 1 5 4 6
14
Output:
No

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,start=0,next=0,sum,currsum=0;
		n = sc.nextInt();
		int[] a = new int[n];
		for(i=0;i<n;i++){
		    a[i] = sc.nextInt();
		}
		sum = sc.nextInt();
		currsum = a[0]+a[1];
		while(start<n && next<n){
		   if(currsum == sum){
		       System.out.print("Yes");
		       System.exit(0);
		   }
		   else if(currsum<sum && next+1<n){
		       next++;
		       currsum += a[next];
		   }
		   else{
		       currsum -= a[start];
		       start++;
		   }
		}
		
		System.out.println("No");

	}
}
