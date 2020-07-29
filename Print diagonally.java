/*
If the matrix is    

1 2 3
4 5 6
7 8 9
The output should Return the following :

[ 
  [1],
  [2, 4],
  [3, 5, 7],
  [6, 8],
  [9]
]
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
		    int mat[][]=new int[n][n];
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            mat[i][j]=sc.nextInt();
		        }
		    }
		    int i=0;
		    int k=0;
		    for(int j=0;j<n;j++){
		      i=0;
		      k=j;
		      while(k>=0)
		      System.out.print(mat[i++][k--]+" ");
		    }
		    int j=0;
		    for(i=1;i<n;i++){
		        j=n-1;
		        k=i;
		        while(k<n)
		        System.out.print(mat[k++][j--]+" ");
		    }
		    System.out.println();
		}
	}
}
