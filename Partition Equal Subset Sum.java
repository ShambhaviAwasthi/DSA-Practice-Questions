/*
Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.

Note:

Each of the array element will not exceed 100.
The array size will not exceed 200.
 

Example 1:

Input: [1, 5, 11, 5]

Output: true

Explanation: The array can be partitioned as [1, 5, 5] and [11].
*/

class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        
        if(sum%2!=0)
            return false;
        
        boolean [][]dp=new boolean[sum/2+1][nums.length+1];
        
        for(int i=0;i<nums.length;i++)
            dp[0][i]=true;
        
         for(int i=0;i<sum/2+1;i++)
            dp[i][0]=false;
        
        for(int i=1;i<sum/2+1;i++){
            for(int j=1;j<nums.length+1;j++){
                dp[i][j]=dp[i][j-1];
                if(i>=nums[j-1])
                    dp[i][j]=dp[i][j] || dp[i-nums[j-1]][j-1];
                
            }
        }
        return dp[sum/2][nums.length];    
    }
}
