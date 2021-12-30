package Arrays;

public class main {
    // recursive
    static int minJumps(int[] arr, int l, int h) {
        if (h == l)
            return 0;
        if (arr[l] == 0)
            return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {
            int jumps = minjumps(arr, i, h);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min) {
                min = jumps + 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
        int n = arr.length;
        System.out.println(minJumps(arr, 0, n - 1));

        // T.C==O(n^n) --> n POSSIBLE MOVES FROM AN ELEMENT
        // S.C==O(1) ---> if(recursixe stack is ignored)
    }

}

    // dp

    // left to right

    static int minJumps(int[] arr, int n) {
        int[] jumps = new int[n];

        int i, j;
        if (n == 0 || arr[0] == 0)
            return Integer.MAX_VALUE;

        jumps[0] = 0;
        for (int i = 1; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }

        }
        return jumps[n - 1];
    }

    // right to left
    static int minJumps(int[] arr, int n) {
        int[] jumps = new int[n];
        jumps[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            for (int j = i + 1; j < n && j <= arr[i] + i; j++) {
                if (min > jumps[j])
                    min = jumps[j];
            }
            if (min != Integer.MAX_VALUE)
                jumps[i] = min + 1;
            else
                jumps[i] = min;
        }
        return jumps[0];
        // T.C===O(n^2)
    }

    //
    // T.C(O(1))
    //

    static int minJumps(int[] arr){
            if(arr.length<=1) return 0;
            if(arr[0]==0) return Integer.MAX_VALUE;

            int maxReach=arr[0];
            int step=arr[0];
            int jump=1;

            for(int i=1;i<arr.length;i++){
                if(i==arr.length-1) return jump;
                maxReach=Math.max(maxReach,i+arr[i]);
                step--;
                if(step==0){
                    jump++;
                    if(i>=maxReach) return -1;
                    step=maxReach-i;
                }
            }
            return -1;
            //      T.C(O(n))
            //      S.C(O(1))
        }
