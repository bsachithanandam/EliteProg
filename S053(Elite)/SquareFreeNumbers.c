/*

The program must accept an integer N as the input. 
The program must print the number of square free numbers that divide the given integer N as the output.
A square free number is one that is not divisible by a perfect square (other than 1). Note that 1 is not considered a square free number.

Boundary Condition(s):
1 <= N < 10^9

Input Format:
The first line contains N.

Output Format:
The first line contains an integer representing the number of square free numbers that divide the given integer N.

Example Input/Output 1:
Input:
20
Output:
3
Explanation:
Here N = 20.
The integers that divide 20 are given below.
1, 2, 4, 5, 10, 20
1 is not a square free number.
4 is a perfect square.
20 is divisible by 4, which is a perfect square.
2 and 5 are prime numbers. So they are square free numbers.
10 is divisible by 1, 2, 5 and 10, and none of them are perfect squares.
Hence the square free numbers that divide 20 are 2, 5 and 10.
Hence the output is 3

Example Input/Output 2:
Input:
72
Output:
3
Explanation:
Here N = 72.
The integers that divide 72 are given below.
1, 2, 3, 4, 6, 8, 9, 12, 18, 24, 36, 72
1 is not a square free number.
4, 9 and 36 are perfect squares.
8, 12, 18, 24 and 72 are divisible by one of the perfect squares.
Hence only 2, 3 and 6 are square free. (It is easily seen that none of them are divisible by a perfect square).
Hence the output is 3

*/

#include<stdio.h>
#include <stdlib.h>

int isPrime(int num){
    if(num<=1){
        return 0;
    }
    if(num==2 || num==3){
        return 1;
    }
    if(num%2==0){
        return 0;
    }
    if((num+1)%6!=0 && (num-1)%6!=0){
        return 0;
    }
    for(int i=3;i*i<=num;i+=2){
        if(num%i==0){
            return 0;
        }
    }
    return 1;
    
}

//Combination logic
long nCr(int n,int r){
    long res = 1;
    if(r>n/2){
        r = n-r;
    }
    for(int i = 0;i<r;i++){
        res *= (n-i);
    }
    for(int i =0;i<r;i++){
        res /= (r-i);
    }
    return res;
}
int main()
{
    int n;
    scanf("%d",&n);
    if(n<=1){
        printf("0");
        return;
    }
    int primeFactor =0;
    for(int val = 1;val*val <=n;val++){
        if(n%val==0){
            if(isPrime(val)){
                primeFactor++;
            }
            int pair = n/val;
            if(val!=pair && isPrime(pair)){
                primeFactor++;
            }
        }
    }
    int sqFree = 0;
    for(int r =1;r<=primeFactor;r++){
        sqFree += nCr(primeFactor,r);
    }
    printf("%d",sqFree);
}
