/*

The program must accept a string S as the input. The program must print all the permutations of the string S as the
output.

Example Input/Output 1:
Input:
abc
Output:
abc
acb
bac
bca
cba
cab

Example Input/Output 2:
Input:
rack
Output:
rack
rakc
rcak
rcka
rkca
rkac
arck
arkc
acrk
ackr
akcr
akrc
cark
cakr
crak
crka
ckra
ckar
kacr
karc
kcar
kcra
krca
krac

*/

#include<stdio.h>
#include <stdlib.h>
void swap(char a[],int s,int e){
    char temp = a[s];
    a[s] = a[e];
    a[e] = temp;
}
void permute(char a[],int l,int r){
    if(l==r){
        printf("%s\n",a);
    }
    else{
        for(int i=l;i<=r;i++){
            swap(a,l,i);
            permute(a,l+1,r);
            swap(a,l,i);
        }
    }
}
int main()
{
    char s[11];
    scanf("%s",s);
    permute(s,0,strlen(s)-1);

}
