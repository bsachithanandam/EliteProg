/*

The program must accept an integer N as the input. The program must print the desired pattern as shown in the
Example Input/Output section.

Input Format:
The first line contains N.
Output Format:
The first N lines contain the desired pattern as shown in the Example Input/Output section.

Example Input/Output 1:
Input:
5
Output:
1 10 11 20 21
2 9 12 19 22
3 8 13 18 23
4 7 14 17 24
5 6 15 16 25

Example Input/Output 2:
Input:
4
Output:
1 8 9 16
2 7 10 15
3 6 11 14
4 5 12 13

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j,k,l,m=1,x=1;
		n = sc.nextInt();
		k = n+(n-1);
		l = 1;
		for(i=0;i<n;i++){
		    for(j=0;j<n;j++){
		        if(j==0){
		            System.out.print(m+" ");
		        }
		        else if(j%2==0){
		          System.out.print(m+l+" ");
		          m = m+l;
		        }
		        else{
		            System.out.print(m+k+" ");
		            m = m+k;
		        }
		    }
		    l+=2;
		    k-=2;
		    m = i+2;
		    System.out.println();
		}

	}
}
