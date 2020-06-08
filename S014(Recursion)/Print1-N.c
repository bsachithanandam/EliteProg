/*

The program accepts an integer N as the input and prints the integers from 1 to N as the output. Fill in the blanks
with code so that the program runs successfully.

Input:
5
Output:
1 2 3 4 5
Explanation:
The integers from 1 to 5 are printed as the output.

Input:
12
Output:
1 2 3 4 5 6 7 8 9 10 11 12

*/

#include<stdio.h>
void print(int val)
{
 if( val==0)
 {
 return;
 }
 print(val-1 );
 printf("%d ",val );
}
int main()
{
 int N;
 scanf("%d",&N);
 print(N);
 return 0;
}
