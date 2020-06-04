/*

The program must accept a string S as the input. The program must print the combinations of the characters in the
string S in sorted order.

Input:
abc

Output:
a
ab
abc
ac
b
bc
c

Input:
virus

Output:
i
ir
irs
iru
irus
is
iu
ius
r
rs
ru
rus
s
u
us
v
vi
vir
virs
viru
virus
vis
viu
vius
vr
vrs
vru
vrus
vs
vu
vus

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> res = new ArrayList<String>();
		String input = sc.nextLine();
		int i,j;
		for(i=1;i<(1<<input.length());i++){
		    StringBuilder sb = new StringBuilder();
		    for(j=0;j<input.length();j++){
		        if((i&(1<<j)) !=0){
		            sb.append(input.charAt(j));
		        }
		    }
		    res.add(sb.toString());
		}
		Collections.sort(res);
		for(String str : res){
		    System.out.println(str);
		}

	}
}
