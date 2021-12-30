package Bitmanipulation;

//1. using sorting COMPARING ADJACENT ELEMENTS
// T.C==O(nlogn)

//2. uing XOR
// T.c==O(N) S.C==O(1)
   static void unique(int[] arr,int n){
       int sum=0;
       for(int i=0;i<n;i++){
           sum=(sum ^ arr[i]);
       }
       sum=(sum & -sum);
       int sum1=0;
       int sum2=0;
       for(int i=0;i<n;i++){
           if((arr[i] & sum) >0){
               sum1=(sum1 ^ (arr[i));
           }else{
               sum2=(sum2 ^ (arr[i]));
           }
       }
       System.out.println(sum1 + " " +sum2);

   }


//3. using maps by freq of the element
//T.C=O(nlogn) S.C=O(n)




//4.using sets just finding duplicates if its occured or not
//T.C=O(n) S.C=O(n)