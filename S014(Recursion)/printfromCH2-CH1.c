/*

The program accepts two alphabets CH1 and CH2 as the input and prints the alphabets from CH2 to CH1 in reverse
order as the output. Fill in the blanks with code so that the program runs successfully.

Example Input/Output 1:
Input:
a d
Output:
d c b a

Example Input/Output 2:
Input:
c p
Output:
p o n m l k j i h g f e d c

*/

#include <stdio.h>
void printAlphabetsReverse(char CH1, char CH2)
{
 if(CH2>=CH1)
 {
 printf("%c ",CH2 );
 printAlphabetsReverse(CH1,CH2-1 );
 }
}
int main()
{
 char CH1, CH2;
 scanf("%c %c", &CH1, &CH2);
 printAlphabetsReverse(CH1, CH2);
 return 0;
}
