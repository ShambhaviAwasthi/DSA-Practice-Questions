// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3589/

class Solution {
    public boolean check(int arr[],int p[]){
        int n=arr.length;
        int m=p.length;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(arr[i]==p[j]){
                i++;
                j++;
                if(j==m)
                    return true;
            }
            else{
                i=i-j+1;
                j=0;
            }
        }
        return false;
    }
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for(int i=0;i<pieces.length;i++){
           if(!check(arr,pieces[i])) 
               return false;
        }
        return true;
    }
}
