/*

The program must accept an integer matrix of size R*C containing only 1's and 0's as the
input. 1indicates land and 0 indicates water. The program must print the number of islands in the given matrix as
the output. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically or
diagonally.

Example Input/Output 1:
Input:
5 6
0 1 0 1 1 1
1 0 0 1 1 1
1 0 0 1 0 0
0 0 0 1 0 1
0 1 1 0 0 1
Output:
3
Explanation:
The 3 islands in the matrix are highlighted below.
0 1 0 1 1 1
1 0 0 1 1 1
1 0 0 1 0 0
0 0 0 1 0 1
0 1 1 0 0 1

Example Input/Output 2:
Input:
6 4
0 1 1 1
1 0 1 0
1 1 1 0
0 0 0 1
0 1 1 1
1 1 1 1
Output:
1

*/

import java.util.*;
public class Hello {
    public static void dfs(int[][] mat,int row,int col,int r,int c){
        if(row>=0 && row<r && col>=0 && col<c){
            if(mat[row][col] == 0){
                return;
            }
            mat[row][col]=0;
            dfs(mat,row,col-1,r,c);
            dfs(mat,row,col+1,r,c);
            dfs(mat,row-1,col,r,c);
            dfs(mat,row+1,col,r,c);
            dfs(mat,row-1,col-1,r,c);
            dfs(mat,row-1,col+1,r,c);
            dfs(mat,row+1,col-1,r,c);
            dfs(mat,row+1,col+1,r,c);
        }
    }
    public static void main(String[] args) {
		int r,c,i,j,count=0;
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		int[][] a = new int[r][c];
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        a[i][j] = sc.nextInt();
		    }
		}
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        if(a[i][j] == 1){
		            count++;
		            dfs(a,i,j,r,c);
		        }
		    }
		}
		System.out.println(count);

	}
}
