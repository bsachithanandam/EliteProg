/*

A top secret message string S containing letters from A-Z (only upper case letters) is encoded to numbers using the following mapping:
'A' -> 1, 'B' -> 2 and so on till Z -> '26'
The program must print the total number of ways in which the received message can be decoded.

Example Input/Output 1:
Input:
123
Output:
3
Explanation:
1-A 2-B 3-C 12-L 23-W.
Hence 123 can be decoded as ABC or AW or LC, that is in 3 ways.

Example Input/Output 2:
Input:
1290
Output:
0

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ways,prevWays,backup,n,i;
		ways = prevWays = 1;
		String s = sc.nextLine();
		n = s.length();
		if(s.charAt(n-1)=='0'){
		    ways = 0;
		}
		for(i=n-2;i>=0;i--){
		    backup = prevWays;
		    prevWays = ways;
		    if(s.charAt(i)=='0'){
		        ways=0;
		        continue;
		    }
		    int twoDigit = Integer.parseInt(s.substring(i,i+2));
		    if(twoDigit <= 26){
		        ways += backup;
		    }
		}
        System.out.println(ways);
	}
}
