/*

Flip Bits

The program must accept two integers A and B as the input. The program must print the number of bits to be flipped to convert A to B as the output.

Input:
12 10
Output:
2
Explanation:
The binary representation of 12 is 1100.
The binary representation of 10 is 1010.
After flipping the middle 2 bits in the binary representation of 12, it becomes the binary representation of 10.
So 2 is printed as the output.

Input:
10 20
Output:
4

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,count=0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = a^b;
		while(c!=0){
		    count += c&1;
		    c /= 2;
		}
        System.out.println(count);
	}
}
