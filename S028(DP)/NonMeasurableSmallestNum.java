/*

A shop-keeper is having N integer values representing the measurement weights. He wishes to find the smallest
integer value of weight that cannot be measured using these N weights. Please help the shop keeper by completing
the program.

Example Input/Output 1:
Input:
4
2 4 1 10
Output:
8
Explanation:
1, 2, 4 and 10 can be measured using the given single measurement.
3 - 1 and 2
5 - 1 and 4
6 - 2 and 4
7 - 1, 2 and 4
8 - cannot be measured and hence is printed as the output.

Example Input/Output 2:
Input:
5
1 4 2 4 3
Output:
15

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j,m=1;
		n = sc.nextInt();
		int[] arr = new int[n];
		for(i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
	    for(i=0;i<n;i++){
		    if(arr[i]<=m){
		        m+=arr[i];
		    }
		    else{
		        break;
		    }
		}
        System.out.println(m);
	}
}
