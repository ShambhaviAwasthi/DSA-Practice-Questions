/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*/

class Solution {
    static int reverse(int x) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        int rev=0;
        while(x!=0){
            int pop=x%10;
            x/=10;
            if(rev>Integer.MAX_VALUE/10 ||(rev == Integer.MAX_VALUE / 10 && pop > 7)) 
                return 0; 
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))                      return 0;
            rev=rev*10+pop;
        }
        return rev;
        
    }
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int y=reverse(x);
        if(x==y)
            return true;
        else
            return false;
        
    }
}
