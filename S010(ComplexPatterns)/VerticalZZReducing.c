/*

The program must accept an integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section.

Example Input/Output 1:
Input:
5
Output:
1
2 9
3 8 10
4 7 11 14
5 6 12 13 15

Example Input/Output 2:
Input:
6
Output:
1
2 11
3 10 12
4 9 13 18
5 8 14 17 19
6 7 15 16 20 21

*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,i,j,k=1;
    scanf("%d ",&n);
    for(i=0;i<n;i++){
        for(j=0;j<=i;j++){
            int m = 1+j*n-(j-1)*j/2;
            if(j%2==0){
                printf("%d",m+i-j);
            }
            else{
                printf("%d",m+n-1-i);
            }
        }
        printf("\n");
    }

}
