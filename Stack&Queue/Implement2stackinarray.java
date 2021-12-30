package Stack&Queue;

class Two twoStacks{
    int[] arr;
    int size;
    int top1,int top2;

    twoStacks(int n){
        size=n;
        arr=new int[n];
        top1=n/2;
        top2=n/2+1;
     }

    void push1(int x) {
        if (top1 > 0) {
            top1--;
            arr[top1] = x;
        } else {
            System.out.println("Stackoverflow");
            return;
        }
    }

    void push2(int x) {
        if (top2 < size - 1) {
            top2++;
            arr[top2] = x;
        } else {
            System.out.println("Overflow");
            return;
        }
    }

    void pop1(){
        if(top1<=size/2){
            int x=arr[top1++];
            return x;
        }else{
            System.out.println('UNDERFLOW');
        }
        return 0;
     }

    void pop2(){
         if(top2>=size/2+1){
             int x=arr[top2--];
             return x;
         }else{
             System.out.println('UNDERFLOw');
         }
         return 0;
        }
}

class Heap {
    public static void main(String[] args) {
        twoStacks ts = new twoStacks(5);
        ts.push1(5);
        ts.push1(10);
        ts.push1(15);
        ts.push1(20);
        ts.pop1();
        ts.pop1();
    }
}