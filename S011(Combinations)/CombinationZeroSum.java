/*
The program must accept N integers as the input. The program must print the number of combinations
of the integers (among the N integers) which add up to 0 as the output.

Input:
5
10 -5 5 -15 20
Output:
3
Explanation:
The three combinations which add up to 0 are
10, 5, -15
20, -5, -15
-5, 5

Input:
7
10 -5 5 -15 20 5 10
Output:
10

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j,sum,c=0;
		n = sc.nextInt();
		int[] a = new int[n];
		for(i=0;i<n;i++){
		    a[i] = sc.nextInt();
		}
		for(i=1;i<(1<<n);i++){
		    sum = 0;
		    for(j=0;j<n;j++){
		        if((i&(1<<j))!=0){
		            sum += a[j];
		        }
		    }
		    if(sum==0){
		        c++;
		    }
		}
        System.out.print(c);
	}
}
