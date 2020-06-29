/*

The program must accept an integer N as the input. The program must print the largest possible odd integer using all
the digits in N as the output. If it is not possible to form such an integer, the program must print no as the output.

Example Input/Output 1:
Input:
120087460153
Output:
876543210001
Explanation:
The largest possible odd integer using all the digits in 120087460153 is 876543210001.

Example Input/Output 2:
Input:
246228
Output:
no

*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    unsigned long long int n;
    int i,ud=-1;
    int digit[10];
    for(i=0;i<10;i++){
        digit[i]=0;
    }
    scanf("%llu",&n);
    while(n>0){
        digit[n%10]++;
        n/=10;
    }
    //Finding smallest possible unit digit.
    for(i=1;i<10;i+=2){
        if(digit[i]>0){
            ud=i;
            digit[i]--;
            break;
        }
    }
    if(ud==-1){
        printf("no");
        return 0;
    }
    //To check if there is any other digit other than 0 ** to recitfy the failing testcase 1000 => o/p(1)
    int start = 1;
    for(i=1;i<=9;i++){
        if(digit[i]>0){
            start = 0;
            break;
        }
    }
    for(i=9;i>=start;i--){
        while(digit[i]>0){
            printf("%d",i);
            digit[i]--;
        }
    }
    printf("%d",ud);


}
