/*
Given a string s, the task is to count number of subsequences of the form aibjck, where i >= 1, j >=1 and k >= 1.

Note: Two subsequences are considered different if the set of array indexes picked for the 2 subsequences are different.


Examples:

Input  : abbc
Output : 3
Subsequences are abc, abc and abbc

Input  : abcabc
Output : 7
Subsequences are abc, abc, abbc, aabc
abcc, abc and abc
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
		for(int p=0;p<t;p++){
		    String s=sc.next();
		    int l=s.length();
		    int a=0;
		    int b=0;
		    int c=0;
		    for(int i=0;i<l;i++){
		        if(s.charAt(i)=='a')
		        a=1+2*a;
		        else if(s.charAt(i)=='b')
		        b=a+2*b;
		        else if(s.charAt(i)=='c')
		        c=b+2*c;
		    }
		    System.out.println(c);
		}
	}
}

/*
explaination 

ac = current # of ways to select at least one a
bc = current # of ways to select at least one a followed by at least one b
cc = current # of ways to select at least one a followed by at least one b followed by at least one c

Explanation of above logic using bc = ac+2*bc:

When coming across a new 'b', consider all combinations counted by ab thus far. All of those combinations are still valid plus each one of those combinations with the newly discovered 'b' at the end. This is why our bc assignment needs to have 2*bc as part of the sum.

The other part of the sum is ac. Everything counted thus far has at least one of the previously seen 'b's but having just seen a new 'b', we must consider all of the "a^i b^j" combinations where /none/ of the previous b's are used. This is equivalent to the number of ways you can select at least one previously seen 'a' because each of those grouping of 'a's can now be paired with the newly found 'b'.

This explanation is for bc=ac+2*bc but can be extended in either direction to describe ac=1+2*ac and cc=bc+2*cc.

/*
