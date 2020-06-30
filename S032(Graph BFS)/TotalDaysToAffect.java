/*

An integer matrix of size RxC containing only the values 0, 1 and 2 is given as the input to the program. The
value 0 indicates an empty space, the value 1 indicates a person is healthy and the value 2 indicates a person is
infected by the corona virus. Every day the virus is spread from infected person to other persons (all four adjacent
persons). The program must print the minimum number of days required to spread the coronavirus to all individuals.
If all the persons can not be affected by the corona virus, the program must print -1 as the output.

Boundary Condition(s):
1 <= R, C <= 1000

Input Format:
The first line contains R and C separated by a space.
The next R lines, each containing C integers separated by a space.

Output Format:
The first line contains -1 or the minimum number of days required to spread the coronavirus to all individuals.

Example Input/Output 1:
Input:
3 5
2 1 0 2 1
1 0 1 2 1
1 0 0 2 1
Output:
2
Explanation:
After Day 1:
2 2 0 2 2
2 0 2 2 2
1 0 0 2 2
After Day 2:
2 2 0 2 2
2 0 2 2 2
2 0 0 2 2

Example Input/Output 2:
Input:
3 5
2 1 0 2 1
0 0 1 2 1
1 0 0 2 1
Output:
-1

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,c,i,j;
		int healthy=0,days=0;
		r = sc.nextInt();
		c = sc.nextInt();
		int[][] mat = new int[r][c];
		Queue<Integer> queue = new ArrayDeque<>();
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        mat[i][j] = sc.nextInt();
		        if(mat[i][j]==1){
		            healthy++;
		        }
		        if(mat[i][j]==2){
		            queue.add(i*c+j);
		        }
		    }
		}
		queue.add(-1);
		while(!queue.isEmpty()){
		    int node = queue.poll();
		    if(node==-1){
		        if(!queue.isEmpty()){
		            days++;
		            queue.add(-1);
		        }
		        continue;
		    }
		    int row = node/c , col = node%c;
		    if(col!=0 && mat[row][col-1]==1){ // Traverses the left side.
		        mat[row][col-1]=2;
		        queue.add(row*c+col-1);
		        healthy--;
		    }
		    if(col!=c-1 && mat[row][col+1]==1){ //Traverses the right side.
		        mat[row][col+1]=2;
		        queue.add(row*c+col+1);
		        healthy--;
		    }
		    if(row!=0 && mat[row-1][col]==1){ //traverses top
		        mat[row-1][col] = 2;
		        queue.add((row-1)*c+col);
		        healthy--;
		    }
		    if(row!=r-1 && mat[row+1][col]==1){ //traverses bottom
		        mat[row+1][col] = 2;
		        queue.add((row+1)*c+col);
		        healthy--;
		    }
		}
		if(healthy==0){
		System.out.println("The total number of days is: "+days);
		}
		else{
		    System.out.println("Not all are infected");
		}
		

	}
}
