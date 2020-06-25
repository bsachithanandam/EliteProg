/*

The program must accept an integer matrix of size R*C and an integer K as the input. 
The program must print the sum of integers in the K*K sub-matrix which 
has the maximum sum S among the all possible K*K sub-matrices in the given R*C matrix as the output.

Example Input/Output 1:
Input:
4 5
10 20 80 40 55
90 50 90 200 65
60 20 5 20 12
10 50 40 60 8
3
Output:
567
Explanation:
The 3*3 sub-matrix which has the maximum sum is given below.
80 40 55
90 200 65
5 20 12

Example Input/Output 2:
Input:
4 3
4 9 8
2 4 4
5 7 3
7 6 8
2
Output:
25

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		int r,c,i,j;
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		int[][] mat = new int[r][c+1];
		for(i=0;i<r;i++){
		   mat[i][0] = 0;
		}
		for(i=0;i<r;i++){
		    for(j=1;j<=c;j++){
		        int curr = sc.nextInt();
		        mat[i][j] = curr+mat[i][j-1];
		    }
		}
		int k = sc.nextInt();
		int max = Integer.MIN_VALUE;
		for(i=0;i<=r-k;i++){
		    for(j=1;j<c-k+1;j++){
		        int sum =0;
		        for(int s=i;s<i+k;s++){
		            sum+=mat[s][j+k-1];
		        }
		        if(sum>max){
		            max = sum;
		        }
		    }
		}
		  System.out.println(max);

	}
}
