
static int Bit_difference(int A,int B){
    int flips=0;
    while(A>0 || B>0){
        int t1=(A&1);
        int t2=(B&1);
        if(t1!=t2){
            flips++;
        }
        a>>=1;
        b>>=1;
    }
    return flips;
}

//another
static int  countsetbits(int n){
    int count=0;
    while(n>0){
        count++;
        n&=(n-1);
    }
    return count;
}


static int flippedCount(int a,int b){
    return countsetbits(a^b);
}