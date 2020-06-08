/*

The program accepts an integer N as the input and prints the integers from N to 1 as the output. Fill in the blanks
with code so that the program runs successfully.

Input:
4
Output:
4 3 2 1
Explanation:
The integers from 4 to 1 are printed as the output.

Input:
9
Output:
9 8 7 6 5 4 3 2 1

*/

#include<stdio.h>
void print(int val)
{
 if( val ==0 )
 {
  return;
 }
 printf("%d ",val );
 print(val-1);
}
int main()
{
 int N;
 scanf("%d",&N);
 print(N);
 return 0;
}
