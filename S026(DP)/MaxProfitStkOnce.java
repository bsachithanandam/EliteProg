/*
The program must accept the stock prices on N days as the input. A person can buy a stock on a particular day and he can sell it once on any other given day.
He can not buy and sell on the same day. The program must print the maximum possible profit P that can be obtained by buying and selling 1 stock once as the output.

Example Input/Output 1:
Input:
7
50 100 40 60 70 50 80
Output:
50
Explanation:
Here N = 7.
The stock price on the 1 day is 50 and the stock price on the 2 day is 100.
On buying the stock on the 1 day and selling it on the 2 day can earn the maximum profit 50 (100 - 50 = 50).
Hence the output is 50

Example Input/Output 2:
Input:
10
15 10 60 70 45 5 70 30 100 90
Output:
95

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,minPrice,maxProfit=0;
		n = sc.nextInt();
		int[] arr = new int[n];
		for(i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		minPrice = arr[0];
		for(i=1;i<n;i++){
		    if(arr[i]<minPrice){
		        minPrice = arr[i];
		    }
		    else{
		        int profit = arr[i] - minPrice;
		        if(profit>maxProfit){
		            maxProfit = profit;
		        }
		    }
		}
        System.out.println(maxProfit);
	}
}
