package Dp;


//recursive
static int count(int[] S,int m,int n){
    if(n==0) return 1;
    if(n<0) return 0;
    if(m<=0 && n>=1) return 0;
    return count(S,m-1,n)+ count(S,m,n-S[m-1]);
}


//iterative
static int count(int[] S,int m,int n){
    int[] dp=new int[n+1];
    for(int i=0;i<m;i++){
        for(int j=S[i];j<=n;j++){
            dp[j]+=dp[j-S[i]];
        }
    }
    return dp[n];
}
