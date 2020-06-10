/*

The program must accept an integer N as the input. The program must print all the prime numbers from 2 to N
(inclusive of N) as output.

Input:
11
Output:
2 3 5 7 11

Input:
120
Output:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109 113

*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,i,j;
    scanf("%d",&n);
    int a[n+1];
    for(i=2;i<=n;i++){
        a[i] = 1;
    }
    for(i=2;i*i<=n;i++){
        if(a[i]==1){
            a[i*i]=0;
            j = i*i;
            while(j<=n){
                if(a[j]==1){
                    a[j]=0;
                }
                j+=i;
            }
        }
    }
    for(i=2;i<=n;i++){
        if(a[i]==1){
            printf("%d ",i);
        }
    }

}
