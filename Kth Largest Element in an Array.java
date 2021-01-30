// https://leetcode.com/problems/kth-largest-element-in-an-array/

class Solution {
    int size=0;
    
    // swap function
    public void swap(int a,int b, int[] arr){
        int temp=arr[a];
         arr[a]=arr[b];
        arr[b]=temp;
    }
    
    // insert function
    public void insert(int[] arr, int n ){
        int temp=arr[n]; // store the element to be inserted in temp
        int i=n; // make i equal to the index position of element to be inserted
        while(i>0 && temp>arr[(i-1)/2]) // while i>0 and child is greater than parent we need to swap
        {
            arr[i]=arr[(i-1)/2]; // bring parent down 
            i=(i-1)/2;
        }
        arr[i]=temp;
    }
    
    public void delete(int[] A,int n ){
        swap(0,n,A); // swap root and last element
       int i=0; int j=1;
       while(j<n)
         {
         if(j<n-1 && A[j+1]>A[j]) j=j+1; // check which child is greater
         if(A[i]<A[j]) // if parent is less than child swap and move to next level
         {
         swap(i,j,A);
         i=j; j=2*j+1;
         }
         else
         break;
         } 
    }
   
    public int findKthLargest(int[] nums, int k) {
        size=nums.length;
        
        // insert elements to form heap
        // i is the index of element to be inserted in the heap
        for(int i=1;i<size;i++){
            insert(nums,i);
        }
        for(int i=0;i<k;i++){
            delete(nums,size-1-i);
        }
        
       
        return nums[size-k];
    }
}
