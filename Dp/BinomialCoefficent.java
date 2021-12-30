package Dp;

//O(1)
static int NCR(int n,int r){
    return fact(n)/(fact(r)*fact(n-r));
}
static int fact(int n){
    int res=1;
    for(int i=2;i<=n;i++){
        res=res*i;
    }
    return res;
}

//recursion
static int BC(int n,int k){
    if(k>n) return 0;
    if(k==0 || k==n) return 1;
    return BC(n-1,k-1) +BC(n-1,k);
}


//dp
static int BC(int n,int k){
    int[][] C=new int[n+1][k+1];
    int i,j;
    for(i=0;i<=n;i++){
        for(j=0;j<=Math.min(i,k);j++){
            if(j==0 || j==i) C[i][j]=1;
            else{
                C[i][j]=C[i-1][j-1]+C[i-1][j];
            }
        }
    }
    return C[n][K];
}
