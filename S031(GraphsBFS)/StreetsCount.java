/*
Mr.X has a bike and is travelling in a town which has N horizontal (West to East direction) and N vertical (North to South direction) streets. 
At the meeting junctions of these horizontal and vertical streets there may be a block. 
If there is a block Mr.X can take diversion to any other street and travel to his destination. 
A value of 1 indicates that a junction (meeting point of two roads) is NOT blocked and a value of 0 indicates that a junction is blocked. 
The streets are numbered from 0 to N-1 (similar to array indices). The source (starting junction of Mr.X and the destination junctions details are passed as the input.
The program must print the number of streets through which Mr.X must travel to travel from the source to destination.

Boundary Condition(s):
1 <= N <= 100

Input Format:
The first line contains N.
The next N lines each containing N values 1 or 0 separated by a space.
The (N+2) line contains the source junction co-ordinates separated by a space.
-The (N+3) line contains the destination junction co-ordinates separated by a space.

Output Format:
The number of streets Mr.X must travel to travel from source to destination.

Example Input/Output 1:
Input:
3
1 0 1
1 0 1
1 1 1
0 0
0 2
Output:
3
Explanation:
The source is (0,0) indicated as S and the destination (0,2) by D.
S 0 D
1 0 1
1 1 1
0 implies block. Hence Mr.X must travel along 1s. Hence the path to travel is denoted by letter P from S to D.
S 0 D
P 0 P
P P P
Hence we can notice that Mr.X must travel through 3 streets to reach the destination.

Example Input/Output 2:
Input:
4
1 1 1 0
0 0 1 1
1 1 0 1
0 1 1 1
0 1
2 0
Output:
7
Explanation:
The path denoted by the letter P is
1 S P 0
0 0 P P

*/

import java.util.*;
public class Hello {

    public static List<Integer> getRelatedNodes(int[][] mat,int a,int n){
        List<Integer> nodes = new ArrayList<>();
        int row = a/n;
        int col = a%n;
        int i,j;
        for(i=col-1;i>=0;i--){ //traversing left nodes
            if(mat[row][i]==1){
                nodes.add(row*n+i);
            }else{ break; }
        }
        
        for(i=col+1;i<n;i++){ //traversing right nodes
            if(mat[row][i]==1){
                nodes.add(row*n+i);
            }else{ break; }
        }
        
        for(i=row-1;i>=0;i--){ //traversing top nodes
            if(mat[i][col]==1){
                nodes.add(i*n+col);
            }else{ break; }
        }
        
        for(i=row+1;i<n;i++){ //traversing bottom nodes
            if(mat[i][col]==1){
                nodes.add(i*n+col);
            }else{ break; }
        }
        return nodes;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j,source,destn;
		n = sc.nextInt();
		int[][] mat = new int[n][n];
		for(i=0;i<n;i++){
		    for(j=0;j<n;j++){
		        mat[i][j] = sc.nextInt();
		    }
		}
		boolean[] visited = new boolean[n*n];
		int[] street = new int[n*n];
		source = sc.nextInt()*n+sc.nextInt();
		destn = sc.nextInt()*n+sc.nextInt();
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(source);
        visited[source] = true;
        street[source] = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
		    List<Integer> Relnodes = getRelatedNodes(mat,node,n);
		    for(Integer x : Relnodes){
		        if(!visited[x]){
		            queue.add(x);
		            visited[x]=true;
		            street[x] = street[node]+1;
		            if(x==destn){
		                System.out.println("Total number of streets is: " +street[x]);
		                return;
		            }
		        }
		    }
		}
        System.out.println(street[destn]);
	}
}
