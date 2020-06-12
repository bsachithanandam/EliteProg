/*

The program accepts two alphabets CH1 and CH2 as the input and prints the alphabets from CH1 to CH2 as the
output. Fill in the blanks with code so that the program runs successfully.

Example Input/Output 1:
Input:
c m
Output:
c d e f g h i j k l m

Example Input/Output 2:
Input:
a g
Output:
a b c d e f g

*/

#include <stdio.h>
void printAlphabets(char CH1, char CH2)
{
 if(CH1<=CH2 )
 {
 printf( "%c ",CH1);
 printAlphabets(CH1+1,CH2 );
 }
}
int main()
{
 char CH1, CH2;
 scanf("%c %c", &CH1, &CH2);
 printAlphabets(CH1, CH2);
 return 0;
}
