package Bitmanipulation;


static int solution(int[] arr){
    logn res=0;
    for(int i=0;i<32;i++){

        int counton=0;
        for(int val: arr){
            if((val & (1<<i))!=0){
                count++;
            }
        }
        int countoff=arr.length-counton;
        System.out.println(counton * count off *2);
    }
}
