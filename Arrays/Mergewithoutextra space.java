package Arrays;
public static vois main(String[] args){
    int[] arr1={1,2,3,4,6};
    int[] arr2={2,3,8,9};
    int m=arr1.length;
    int n=arr2.length;
    for(int i=n-1;i>=0;i--){
        int j,last=arr1[m-1];
        for(int j=m-2;j>=0 && arr1[j]>arr2[i];j--){
            arr1[j+1]=arr1[j];
        }

        if(j!=m-2 || last>arr2[i]){
            arr1[j+1]=arr2[i];
            arr2[i]=last;
        }
        //TC:O(M*n)
    }
}
