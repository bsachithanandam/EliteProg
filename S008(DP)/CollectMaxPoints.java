/*
Collect Maximum Points from given cell

A game has a board with an RxC matrix having R rows and C columns containing positive integer values as cell
values. A player can start from the cell S whose indices are passed as the input. The player can perform the following
two navigations after collecting the points in the cell S.
- The player can move to the right cell.
- The player can move to the bottom cell.
The player cannot come back to the previous row or column. The player navigates until he reaches the bottom-right
cell. The program must print the maximum points a player can collect from the given RxC matrix as the output.
Boundary Condition(s):
2 <= R, C <= 100
1 <= Each integer value <= 1000
Input Format:
The first line contains R and C separated by a space.
The next R lines, each containing C integers separated by a space.
The (R+2) line contains two integers representing the indices of the cell S.
Output Format:
The first line contains the maximum points a player can collect from the given RxC matrix.
Example Input/Output 1:
Input:
4 5
4 2 9 6 1
7 9 6 5 4
5 7 3 8 8
7 4 9 9 4
0 1
Output:
44
Explanation:
The navigation of the player to collect the maximum points from the cell S (0, 1) is highlighted below.
4 2 9 6 1
7 9 6 5 4
5 7 3 8 8
7 4 9 9 4
The maximum points a player can collect is 44 (2+9+7+4+9+9+4).
Hence the output is 44
Example Input/Output 2:
Input:
3 3
70 76 60
18 64 39
45 28 79
1 1
Output:
182

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,c,i,j;
		r = sc.nextInt();
		c = sc.nextInt();
		int[][] mat = new int[r][c];
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        mat[i][j] = sc.nextInt();
		    }
		}
		int[][] max = new int[r][c];
		int start = sc.nextInt();
		int end = sc.nextInt();
		max[start][end] = mat[start][end];
		for(j=end+1;j<c;j++){
		    max[start][j] = mat[start][j] + max[start][j-1];
		}
		for(i = start+1 ; i<r;i++){
		    max[i][end] = mat[i][end] + max[i-1][end];
		}
		for(i=start+1;i<r;i++){
		    for(j=end+1;j<c;j++){
		        max[i][j] = Math.max(max[i][j-1],max[i-1][j])+mat[i][j];
		    }
		    
		}
		System.out.println(max[r-1][c-1]);

	}
}
