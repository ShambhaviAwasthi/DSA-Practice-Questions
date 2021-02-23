

void merge(int []arr, int l,int r, int m){

// find sizes of two arrays
int n1= m- l+1;
int n2=r-m;

// create temp array and copy elements
int []L=new int [n1];
int []R=new int [n2];
for(int i=0;i<n1;i++){
L[i]=arr[l+i];
}
for(int i=0;i<n2;i++){
L[i]=arr[m+1+j];
}

// merge the two arrays

// indexes for sub arrays
int i=0; , int j=0;
// index for the merged array 
int k=0;

while (i<n1 && j<n2){
if(L[i]<R[i]){
arr[k]=L[i];
i++;
}
else{
arr[k]=R[j];
j++;
}
}

/* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
}



void mergeSort(int []arr,int l,int r){
   if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
   
}
