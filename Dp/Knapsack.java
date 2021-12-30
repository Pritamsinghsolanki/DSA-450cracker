package Dp;

static int knapsack(int W,int[] wt,int[] val,n){
    if(n==0 || W==0) return 0;
    if(wt[n-1]>W) return knapsack(W,wt,val,n-1);
    return Math.max(val[n-1]+knapsack(W-wt[n-1],wt,val,n-1),knapsack(W,wt,val,n-1));
    //T.C-->O(2^n) S.C--> O(1)
}

static int knapsack(int W,int[] wt,int[] val,int n){
    int[][] arr=new int[n+1][W+1];
    for(int i=0;i<=n;i++){
        for(int j=0;j<=W;j++){
            if(i==0 || j==0){
                arr[i][j]=0;
            }else if(wt[i-1]>W){
                 arr[i][j]=arr[i-1][j];
            }else{
                arr[i][j]=Math.max(arr[i-1][j],arr[i-1][j-w[i-1]]);
            }
        }
    }
    return arr[n][W];
}


//space optimised
static int knapsack(int W,int[] wt,int[] val,int n){
    int[][] arr=new int[2][W+1];
    for(int i=0;i<=n;i++){
        for(int j=0;j<=W;j++){
            if(i==0 || j==0){
                arr[i%2][j]=0;
            }else if(wt[i-1]>W){
                 arr[i%2][j]=arr[(i-1)%2][j];
            }else{
                arr[i%2][j]=Math.max(arr[(i-1)%2][j],arr[(i-1)%2][j-w[i-1]]);
            }
        }
    }
    return arr[n%2][W];
    // // 2 rows i%2 will be giving the index inside the bounds
    // of 2d array K
}