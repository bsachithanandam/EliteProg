/*

The program must accept N string values as the input. The program must print the common characters that are present in N or N-1 string values in sorted order as the output.
Note: At least one character is always present in N or N-1 string values.

Example Input/Output 1:
Input:
3
orange
apple
pineapple
Output:
aelnp
Explanation:
The common characters that are present in 3 or 2 string values are a, e, l, n and p.
Hence the output is aelnp

Example Input/Output 2:
Input:
4
HardWork
HomeWork
Hungry
Wood
Output:
HWo

*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,i,j;
    int count[128];
    char str[100001];
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%s",str);
        int currcount[128] = {0};
        for(j=0;j<strlen(str);j++){
            if(currcount[str[j]]==0 && (count[str[j]]==i || count[str[j]]==i-1)){
                count[str[j]]++;
                currcount[str[j]]++;
            }
        }
    }
    for(i=1;i<128;i++){
        if(count[i]==n || count[i]==n-1){
            printf("%c",i);
        }
    }
}
