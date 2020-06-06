/*

The program must accept a string S as the input. 
The program must print the first repeating character in S as the output.

Input:
engine
Output:
n

Input:
cool
Output:
o

*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    char a[100001];
    scanf("%s",a);
    int count[128]={0};
    int i;
    for(i=0;i<strlen(a);i++){
        if(count[a[i]]==1){
            printf("%c",a[i]);
            return;
        }
        count[a[i]]++;
    }


}
