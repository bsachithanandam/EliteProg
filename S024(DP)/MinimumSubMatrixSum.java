/*

The program must accept an integer matrix of size R*C and an integer K as the input. The program must print the
sum of integers in the K*K sub-matrix which has the minimum sum S among the all possible K*K sub-matrices of the
given R*C matrix as the output.
Boundary Condition(s):
2 <= R, C <= 1000
2 <= K <= R and C
Input Format:
The first line contains R and C separated by a space.
The next R lines, each containing C integers separated by a space.
The (R+2) line contains K.
Output Format:
The first line contains S.

Example Input/Output 1:
Input:
5 4
8 4 9 7
4 0 5 2
3 5 9 6
3 0 0 4
8 8 6 1
3
Output:
29
Explanation:
The 3*3 sub-matrix which has the minimum sum is given below.
4 0 5
3 5 9
3 0 0

Example Input/Output 2:
Input:
4 4
10 80 50 70
40 30 50 50
50 70 30 20
70 10 40 70
2
Output:
150

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,c,i,j,s,k,min;
		r = sc.nextInt();
		c = sc.nextInt();
		int[][] mat = new int[r][c+1];
		for(i=0;i<r;i++){
		    mat[1][0] = 0;
		}
		for(i=0;i<r;i++){
		    for(j=1;j<=c;j++){
		        int curr = sc.nextInt();
		        mat[i][j] = curr+mat[i][j-1];
		    }
		}
	    k = sc.nextInt();
		min = Integer.MAX_VALUE;
		for(i=0;i<=r-k;i++){
		    for(j=1;j<=c-k+1;j++){
		        int sum = 0;
		        for(s=i;s<i+k;s++){
		            sum += mat[s][j+k-1] - mat[s][j-1];
		        }
		        if(min>sum){
		            min = sum;
		        }
		    }
		}
		System.out.println(min);

	}
}
