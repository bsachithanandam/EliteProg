/*

Codu is trying to go down stairs from his building to ground floor. He can go 3 ways.
1) Walk 1 step at a time.
2) Extend his legs and go 2 steps at a time.
3) Jump down 3 steps at a time.

Given N steps, calculate the number of possible ways W to reach the ground floor, provided he can jump 3 steps.
That is, he can jump down 3 steps only once, but at any time, if he wishes, while walking down the stairs.
Note: As the number of ways W can be huge, print W modulo 1000000007.

Boundary Condition(s):
1 <= N <= 10^6

Input Format:
The first line contains N.

Output Format:
The first line contains W.

Expample Input/Output 1:
Input:
4
Output:
7
Explanation:
The 7 possible ways are given below.
1, 1, 1, 1
1, 1, 2
1, 2, 1
2, 1, 1
2, 2
1, 3
3, 1

Expample Input/Output 2:
Input:
5
Output:
13

*/

#include<stdio.h>
#include <stdlib.h>
#define ULL unsigned long long int

int main()
{
    int modVal = 100000007;
    int n;
    scanf("%d ",&n);
    if(n==1){
        printf("1");
        return;
    }
    ULL without[3];
    ULL with[3];
    without[0] = with[0] = 1;
    without[1] = with[1] = 1;
    without[2] = with[2] = 2;
    ULL sum;
    for(int step =3;step<=n;step++){
        sum = with[2]+with[1]+without[0];
        with[0] = with[1];
        with[1] = with[2];
        with[2] = sum%modVal;
        sum = without[2]+without[1];
        without[0] = without[1];
        without[1] = without[2];
        without[2] = sum %modVal;
    }
    printf("%llu",with[2]);
}
