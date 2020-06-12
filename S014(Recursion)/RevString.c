/*

The program accepts a string S and prints the string S in reverse order as the output. Fill in the blanks with code so
that the program runs successfully.
Example Input/Output 1:
Input:
SkillRack
Output:
kcaRllikS
Example Input/Output 2:
Input:
nota
Output:
aton

*/

#include<stdio.h>
void reverse(char *a,int n )
{
 if( *a)
 {
 reverse(a+1,n+1 );
 printf("%c",*a );
 }
}
int main()
{
 char str[1001];
 scanf("%s",str);
 reverse(str,0);
 return 0;
}
 
