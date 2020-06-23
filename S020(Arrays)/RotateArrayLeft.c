/*

You must implement the function rotate(int arr[],int N,int R) which accepts an integer array arr with it's size N and
an integer R as the input. The function must rotate the array by shifting it R times to the left.

Example Input/Output 1:
Input:
4
10 20 30 40
1000002
Output:
30 40 10 20
Explanation:
Here R = 2
After the first left-rotation, the integers in the array become 20 30 40 10
After the second left-rotation, the integers in the array become 30 40 10 20
Hence the output is 30 40 10 20

Example Input/Output 2:
Input:
7
76 74 18 17 45 29 11
5
Output:
29 11 76 74 18 17 45

*/

#include<stdio.h>
void reverse(int arr[],int s,int e){
    while(s<e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        s++;
        e--;
    }
}

void rotate(int arr[],int n,int r){
    r = r%n;
    reverse(arr,0,n-1);
    reverse(arr,0,n-r-1);
    reverse(arr,n-r,n-1);
    
}
int main()
{
 int N,R;
 scanf("%d",&N);
 int arr[N];
 for(int index=0; index<N; index++)
 {
 scanf("%d",&arr[index]);
 }
 scanf("%d",&R);
 rotate(arr,N,R);
 for(int index=0; index<N; index++)
 {
 printf("%d ",arr[index]);
 }
}
