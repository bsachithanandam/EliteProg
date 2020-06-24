/*

The program must accept two integers X and Y as the input. The program must print the minimum number of operations required to convert the integer X to Y. 
There are two types of operations which are given below.
- Double the integer
- Subtract one from the integer

Example Input/Output 1:
Input:
5 8
Output:
2
Explanation:
Here X = 5 and Y = 8.
1st operation = 5 - 1 = 4
2nd operation = 4 * 2 = 8

Example Input/Output 2:
Input:
10 1
Output:
9

Example Input/Output 3:
Input:
4 35
Output:
8

*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int x,y,c=0;
    scanf("%d%d",&x,&y);
    while(y>x){
        if(y&1){
            y+1;
        }
        else{
            y =y/2;
        }
        c++;
    }
    c += (x-y);
    printf("%d",c);


}
