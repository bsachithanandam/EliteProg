/*

The program must accept N string values as the input. 
The program must print the common characters in all the N string values in sorted order as the output.
Note: At least one character is always present in all the N string values.

Example Input/Output 1:
Input:
5
engine
manager
generation
pen
mentor
Output:
en
Explanation:
The common characters in all the given 5 string values are e and n.
Hence the output is en

Example Input/Output 2:
Input:
3
Africa
Australia
Antarctica
Output:
Aair

Example Input/Output 3:
Input:
2
bbBBB
bbBBB
Output:
Bb

*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,i,j;
    char str[100001];
    int count[128];
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%s",str);
        for(j=0;j<strlen(str);j++){
            if(count[str[j]]==i){
                count[str[j]]++;
            }
        }
    }
    for(i=1;i<128;i++){
        if(count[i]==n){
            printf("%c ",i);
        }
    }
}
