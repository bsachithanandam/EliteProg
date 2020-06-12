/*

Given 3 string values S1, S2 and S3, find if S3 is a valid mix of the first two string values S1 and S2. The third string
value S3 is said to be a mix of the first S1 string and the second S2 string, if it can be formed by interleaving the
characters of the first string and the second string in a way that maintains the left to the right order of occurrence of
the characters for S1 and S2 each string. The program must print YES if it is a valid mix. Else the program must
print NO as the output.

Example Input/Output 1:
Input:
mno
xyz
xmnyzo
Output:
YES
Explanation:
The order of occurrence of xyz and mno is preserved in xmnyzo.
Hence the output YES is printed.

Example Input/Output 2:
Input:
MANO
KON
MAKNOON
Output:
YES

Example Input/Output 3:
Input:
MANO
KON
MAKOONN
Output:
NO

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		String s1,s2,s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		n1 = 0;
		n2 = 0;
		n3 = 0;
		if(isValid(s1,s2,s3,n1,n2,n3)){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
	
	public static boolean isValid(String s1,String s2,String s3,int n1,int n2,int n3){
	    while(n3<s3.length()){
	        if(n1<s1.length() && n2<s2.length() && s1.charAt(n1)==s3.charAt(n3) && s2.charAt(n2) == s3.charAt(n3)){
	            if(isValid(s1,s2,s3,n1+1,n2,n3+1)){
	                return true;
	            }
	            else{
	                return isValid(s1,s2,s3,n1,n2+1,n3+1);
	            }
	            
	        }
	        else if(n1<s1.length() && s1.charAt(n1)==s3.charAt(n3)){
	            n1++;
	            n3++;
	        }
	        else if(n2<s2.length() && s2.charAt(n2)==s3.charAt(n3)){
	            n2++;
	            n3++;
	            
	        }
	        else{
	            return false;
	        }
	    }
	    return true;
	}
}
