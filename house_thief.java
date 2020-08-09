/* Stickler the thief wants to loot money from a society having n houses in a single line. He is a weird person and follows a certain rule when looting the houses. According to the rule, he will never loot two consecutive houses. At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy. He asks for your help to find the maximum money he can get if he strictly follows the rule. Each house has a[i] amount of money present in it.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each test case contains an integer n which denotes the number of houses. Next line contains space separated numbers denoting the amount of money in each house.

Output:
For each testcase, in a newline, print an integer which denotes the maximum amount he can take home.

Constraints:
1 <= T <= 200
1 <= n <= 104
1 <= a[i] <= 104

Example:
Input:
2
6
5 5 10 100 10 5
3
1 2 3
Output:
110
4
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int s=0;s<t;s++){
		    int n=sc.nextInt();
		    int []arr=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    if(n==1)
		    System.out.println(arr[0]);
		    else if(n==2)
		    System.out.println(Math.max(arr[0],arr[1]));
		    else{
		        int curr=0;
		        int pp=arr[0];
		        int p=Math.max(arr[1],arr[0]);
		        for(int i=2;i<n;i++){
		            curr=Math.max(pp+arr[i],p);
		            pp=p;
		            p=curr;
		        }
		        System.out.println(curr);
		    }
		}
	}
}
