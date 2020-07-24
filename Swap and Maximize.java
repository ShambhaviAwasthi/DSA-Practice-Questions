/*
Given an array of n elements. Consider array as circular array i.e element after an is a1. The task is to find maximum sum of the difference between consecutive elements with rearrangement of array element allowed i.e after rearrangement of element find |a1 – a2| + |a2 – a3| + …… + |an – 1– an| + |an – a1|.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case contains the number of elements in the array a[] as n and next line contains space separated n elements in the array a[].

Input:
2
4
4 2 1 8
3
10 12 15​
Output:
18​
10

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
		while(t!=0){
		    t=t-1;
		    int n=sc.nextInt();
		    int []arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int []b=new int[n];
		    int j=0;
		    int idx=0;
		    int k=n-1;
		    while(j<k){
		        b[idx++]=arr[j++];
		        b[idx++]=arr[k--];
		    }
		    if(j==k){
		        b[idx]=arr[j];
		    }
		    int sum=0;
		    for(int i=0;i<n-1;i++){
		        sum=sum+Math.abs(b[i]-b[i+1]);
		    }
		    sum=sum+Math.abs(b[0]-b[n-1]);
		    System.out.println(sum);
		}
		
	}
}
