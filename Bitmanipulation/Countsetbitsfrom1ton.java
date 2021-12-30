
static int countsetbits(int n){
    int i=0;
    int ans=0;
    while((1<<i) <=n ){
        boolean k=false;
        int change=1<<i;
        for(int j=1;j<=n;j++){
            if(k==true) ans++;

            if(change==1){
                k=!k;
                change= 1<<i;
            }
            else {
                change--;
            } 
        }
        i++;
    }
    //T.C= O(k*n)  k--> no. of bits
}