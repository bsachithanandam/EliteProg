/*

The program must accept a string S containing only alphabets as the input. The program must print the alphabets in S along with their number of occurrences in alphabetical order.
Note: The order of the output must be upper case alphabets followed by lower case alphabets.

Input:
award
Output:
a2d1r1w1

Input:
IndianCricketCouncil
Output:
C2I1a1c2d1e1i3k1l1n3o1r1t1u1

*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    char a[100001];
    scanf("%s",a);
    int count[256]={0};
    int i;
    for(i=0;i<strlen(a);i++){
        count[a[i]]++;
    }
    for(i=0;i<128;i++){
        if(count[i]!=0){
            printf("%c%d",(char)i,count[i]);
        }
    }


}
