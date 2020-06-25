/*

The program must accept a string S and an integer K as the input. The program must print the length of the longest substring having exactly K unique characters as the output.

Example Input/Output 1:
Input:
mirror 2
Output:
4
Explanation:
Here K = 2.
The longest substring having exactly 2 unique characters is rror.
So the length of the longest substring rror is 4.
Hence the output is 4

Example Input/Output 2:
Input:
abbcdbbaabbace 3
Output:
8

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int k = sc.nextInt();
		int start=0,end=0;
		int n = str.length();
		int unique=1,max=0;
		int[] arr = new int[128];
		arr[str.charAt(end)]=1;
		while(end<n){
		    if(k==unique){
		        int currlen = end-start+1;
		        if(currlen>max){
		            max = currlen;
		        }
		   }
		    if(unique<=k){
		        end++;
		        if(end<n){
		        arr[str.charAt(end)]++;
		        if(arr[str.charAt(end)]==1){
		            unique++;
		        }
		        }
		    }
		    else{
		        arr[str.charAt(start)]--;
		        if(arr[str.charAt(start)]==0){
		            unique--;
		        }
		        start++;
		    }
		}
		System.out.println(max);
		

	}
}
