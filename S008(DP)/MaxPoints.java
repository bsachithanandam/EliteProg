/*
Collect Maximum points:

A game has a board with an RxC matrix having R rows and C columns containing positive integer values as cell
values. A player can start from the top-left cell and perform the following two navigations after collecting the points in
that cell.
- The player can move to the right cell.
- The player can move to the bottom cell.
The player cannot come back to the previous row or column. The player navigates until he reaches the bottom-right
cell. The program must print the maximum points a player can collect from the given RxC matrix as the output.
Boundary Condition(s):
2 <= R, C <= 50
0 <= Each integer value <= 1000
Input Format:
The first line contains R and C separated by a space.
The next R lines, each containing C integers separated by a space.
Output Format:
The first line contains the maximum points a player can collect from the given RxC matrix.
Example Input/Output 1:
Input:
4 5
4 2 9 6 1
7 9 6 5 4
5 7 3 8 8
7 4 9 9 4
Output:
53
Explanation:
The navigation of the player to collect the maximum points is given below.
4 -> 7 -> 9 -> 7 -> 4 -> 9 -> 9 -> 4
The maximum points a player can collect from the 4x5 matrix is 53 (4+7+9+7+4+9+9+4).
Hence the output is 53
Example Input/Output 2:
Input:
3 3
48 64 47
63 33 14
44 82 52
Output:
289
*/

import java.util.*;
public class MaxPoints {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,c,i,j;
	    r = sc.nextInt();
	    c = sc.nextInt();
	    int[][] a = new int[r][c];
	    int[][] max = new int[r][c];
	    for(i=0;i<r;i++){
	        for(j=0;j<c;j++){
	            a[i][j] = sc.nextInt();
	        }
	    }
	    max[0][0] = a[0][0];
	    for(j =1 ;j<c;j++){
	        max[0][j] = a[0][j]+max[0][j-1];
	    }
	    for(i=1;i<r;i++){
	        max[i][0] = a[i][0] + max[i-1][0];
	    }
	    for(i=1;i<r;i++){
	        for(j=1;j<c;j++){
	            max[i][j] = a[i][j] + Math.max(max[i-1][j],max[i][j-1]);
	        }
	    }
	    System.out.println(max[r-1][c-1]);
	}
}
