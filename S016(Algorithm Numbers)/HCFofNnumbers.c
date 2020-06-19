/*

The program must accept N integers as the input. 
The program must print the HCF of the N integers as the output.

Input:
4
15 20 30 50
Output:
5

Input:
5
14 28 35 70 92
Output:
1

*/

#include<stdio.h>
#include <stdlib.h>
int gcd(int a,int b){
    if(a==0){
        return b;
    }
    return gcd(b%a,a);
}
int findGCD(int a[],int n){
    int i,res=a[0];
    for(i=1;i<n;i++){
        res = gcd(a[i],res);
        if(res==1){
            return 1;
        }
    }
    return res;
}
int main()
{
    int n,i,res;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++){
        scanf("%d ",&a[i]);
    }
    res = findGCD(a,n);
    printf("%d",res);


}
