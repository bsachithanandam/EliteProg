/*
Find the majority element

Given an array of N elements, find the majority element.A majority element is any element which occurs more than N/2 times.

Example:
Input:
5
4 2 4 6 4

Output:
4

Input:
6
2 4 4 6 7 2

Output:
No majority element
*/

import java.io.*;
import java.util.*;

class MajEle{
  public static void main(String args[]){
    int n,i;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] a = new int[n];
    for(i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int count = 1;
    int majEle = a[0];
    for(i=0;i<n;i++){
      if(a[i]==majEle){
        count++;
      }
      else{
        count--;
        if(count == 0){
          majEle = a[i];
          count = 1;
        }
      }
    }
    int actualCount = 0;
    if(count>0){
      for(i=0;i<n;i++){
        if(a[i]==majEle){
          actualCount++;
        }
      }
      if(actualCount > n/2){
        System.out.println(majEle);
        System.exit(0);
      }
   }
   System.out.println("No majority element");
  }
}
