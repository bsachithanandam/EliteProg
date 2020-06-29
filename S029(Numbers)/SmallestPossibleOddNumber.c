/*

The program must accept an integer N as the input. The program must print the smallest possible odd integer using
all the digits in N as the output. If it is not possible to form such an integer, the program must print no as the output.

Example Input/Output 1:
Input:
1670078423
Output:
1002346787
Explanation:
The smallest possible odd integer using all the digits in 1670078423 is 1002346787.

Example Input/Output 2:
Input:
40068
Output:
no

*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    unsigned long long int n;
    int i;
    scanf("%llu",&n);
    int digit[10];
    for(i=0;i<10;i++){
        digit[i]=0;
    }
    int start = 1;
    while(n>0){
        digit[n%10]++;
        n/=10;
    }
    int ud = -1;
    //unit digit of largest number should be the greatest odd number
    for(i=9;i>=1;i-=2){
        if(digit[i]>0){
            ud = i;
            digit[i]--;
            break;
        }
    }
    if(ud==-1){
        printf("no");return;
    }
    //first digit should be non-zero
    for(i=1;i<10;i++){
        if(digit[i]>0){
            printf("%d",i);
            digit[i]--;
            start=0;
            break;
        }
    }
    for(i=start;i<=9;i++){
        while(digit[i]-->0){
            printf("%d",i);
        }
    }
    printf("%d",ud);


}
