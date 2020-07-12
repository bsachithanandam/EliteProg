/*

The program must accept two integers N and X as the input. 
The program must print the integer value nearest to X
with all the digits in N as the output.

Boundary Condition(s):
10 <= N, X <= 10^8

Input Format:
The first lines contains N.

Output Format:
The first lines contains the integer value nearest to X with all the digits in N as the output.

Example Input/Output 1:
Input:
123 200
Output:
213
Explanation:
The integer value nearest to the 200 with all the digits in 123 is 213.

Example Input/Output 2:
Input:
48871 88555
Output:
88471

*/

import java.util.*;
public class Hello {
    static int min = Integer.MAX_VALUE;
    public static int permute(String str1,int i ,int n,int p){
        if(i==n){
            int q = Integer.parseInt(str1);
            if(q-p>0 && q<min){
                min = q;
            }
        }
        else{
            for(int j = 1;j<=n;j++){
                str1 = swap(str1,i,j);
                permute(str1,i+1,n,p);
                str1 = swap(str1,i,j);
            }
        }
        return min;
    }
    
    public static String swap(String str,int i,int j){
        char[] ch  = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] firstLine = sc.nextLine().split(" ");
		String str = firstLine[0].trim();
		int ref = Integer.parseInt(firstLine[1].trim());
		System.out.println(permute(str,0,str.length()-1,ref));
  }
}
