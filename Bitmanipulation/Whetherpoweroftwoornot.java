package Bitmanipulation;

//simple methos
static boolean isPoweroftwo(int n){
    if(n==0) return false;
    return (int)(Math.ceil((Math.log(n)/Math.log(2))))==
           (int)(Math.floor((Math.log(n)/Math.log(2))));

           //T.C=O(1);
           //S.C=O(1)
}


//simple method
static boolean isPower(int n){
    if(n==0) return false;
    while(n!=1){
        if(n%2!=0){
            return false;
        }
        n=n/2;
    }
    return true;
    //T.C==O(log2n)
    //S.C==O(1)
}



//recursion
static boolean isPower(int n){

     if(n==1) return true;

    if(n%2!=0 || n==0) return false;
   
    return isPower(n/2);
   //T.c=O(log2n)
   //S.C=O(logn)
}


//using bitmanipulation
static boolean isPower(int n){
    return n!=0 && ((n&(n-1))==0);
   //O(1)--> T.C
   //O(1) --> S.c
}

//using right most set bit
static boolean isPower(int n){
    if(n==0) return false;
    if((n& (~(n-1)))==n) return true;
    return false;
    //T.C=O(1)
    //S.C=O(1)
}
