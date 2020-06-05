/*

The program must accept N integers (where N is always odd) as the input. Among the N integers, all the integers
have occurred even number of times except one integer X.The program must find and print the integer X as the output.

Input:
5
44 54 88 44 54
Output:
88
Explanation:
The integers 44 and 54 have occurred twice (even number of times).
The integer 88 has occurred only once (odd number of times).
Hence 88 is printed as the output.

Input:
7
55 55 55 55 55 55 55
Output:
55

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,res=0,ele;
		n = sc.nextInt();
		while(n>0){
		    ele = sc.nextInt();
		    res = res^ele;
		    n--;
		}
		System.out.println(res);

	}
}
