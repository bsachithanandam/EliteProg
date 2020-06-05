/*

Count the Number of ones in the Binary Representation of the given number

The program must accept an integer N as the input. The program must print the number of 1s in the binary
representation of N as the output.

Input:
10
Output:
2
Explanation:
The binary representation of 10 is 1010. So there are two 1s in 1010.Hence the output is 2

Input:
15
Output:
4

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,c=0;
		n = sc.nextInt();
		while(n>0){
		    if((n&1)==1){
		        c++;
		    }
		    n = n>>1;
		}
		System.out.print(c);

	}
}
