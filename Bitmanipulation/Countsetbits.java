package Bitmanipulation;

//iterative
static int hammingWeight(int n){
    int count=0;
    while(n!=0){
    if((n&1)==1){
        count++;
    }
    n=n>>1;
}
  return count;
}


//recursive
static int hamming(int n){
    if(n==0) return 0;
    return (n&1) + hamming(n>>1);
}
