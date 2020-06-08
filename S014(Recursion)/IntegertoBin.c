/*

The program accepts an integer N and prints the binary representation of N as the output. Fill in the blanks with code
so that the program runs successfully.

Input:
9
Output:
1001

Input:
26
Output:
11010

*/

#include<stdio.h>
void toBinary(int val)
{
if(val==0)
 {
 return;
 }
toBinary(n/2);
printf("%d",n%2);

}
int main()
{
 int N;
 scanf("%d",&N);
 toBinary(N);
 return 0;
