/*

You must implement the function rotate(int arr[],int N,int R) which accepts an integer array arr with it's size N and
an integer R as the input. The function must rotate the array by shifting it R times to the right.

Example Input/Output 1:
Input:
10
10 20 30 40 50 60 70 80 90 100
3
Output:
80 90 100 10 20 30 40 50 60 70
Explanation:
Here R = 3
After the first right-rotation, the integers in the array become 100 10 20 30 40 50 60 70 80 90
After the second right-rotation, the integers in the array become 90 100 10 20 30 40 50 60 70 80
After the third right-rotation, the integers in the array become 80 90 100 10 20 30 40 50 60 70
Hence the output is 80 90 100 10 20 30 40 50 60 70

Example Input/Output 2:
Input:
5
45 78 12 98 56
10004
Output:
78 12 98 56 45

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
    reverse(arr,0,r-1);
    reverse(arr,r,n-1);
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
