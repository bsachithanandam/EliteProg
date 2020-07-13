/*

The program must accept N integers as the input. For each integer X among the N integers, the program must print
all the factors of X in ascending order as the output.
Note: Python may not be fast enough to execute within the given time limit. So please use C, Java or C++ to
solve.

Boundary Condition(s):
1 <= N <= 15
1 <= Each integer value <= 10^15

Input Format:
The first line contains N.
The second line contains N integers separated by a space.

Output Format:
The first N lines, each containing the integer values representing the factors of an integer in the given N integers.

Example Input/Output 1:
Input:
4
100 17 121 24
Output:
1 2 4 5 10 20 25 50 100
1 17
1 11 121
1 2 3 4 6 8 12 24

Example Input/Output 2:
Input:
7
564 670 915 607 304 357 253
Output:
1 2 3 4 6 12 47 94 141 188 282 564
1 2 5 10 67 134 335 670
1 3 5 15 61 183 305 915
1 607
1 2 4 8 16 19 38 76 152 304
1 3 7 17 21 51 119 357
1 11 23 253

*/

#include<stdio.h>
#include <stdlib.h>
#define ULL unsigned long long int
int main()
{
    int t;
    scanf("%d",&t);
    while(t-->0){
        ULL n;
        scanf("%llu ",&n);
        int ind=0;
        ULL factors[100001];
        for(long long int val = 1;val*val<=n;val++){
            if(n%val==0){
                printf("%lld",val);
                ULL pairFactor = n/val;
                if(val!=pairFactor){
                    factors[ind++] = pairFactor;
                }
            }
        }
        while(ind-->0){
            printf("%llu",factors[ind]);
        }
        printf("\n");
    }
}
