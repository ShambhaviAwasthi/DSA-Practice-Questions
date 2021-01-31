/* Given an unsorted array of integers, find the length of longest increasing subsequence.

Example:

Input: [10,9,2,5,3,7,101,18]
Output: 4 
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 
Note:

There may be more than one LIS combination, it is only necessary for you to return the length.
Your algorithm should run in O(n2) complexity. */

class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0)
            return 0;
        int arr[]=new int[nums.length];
        arr[0]=1;
        for(int i=1;i<nums.length;i++){
            int prev=0;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    prev=Math.max(prev,arr[j]);
                }
            }
            arr[i]=prev+1;
        }
        Arrays.sort(arr);
        return arr[nums.length-1];
    }
}

