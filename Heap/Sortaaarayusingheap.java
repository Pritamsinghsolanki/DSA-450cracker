package Heap;

class Heap {

    public static void maxHeapify(int[] arr, int n, int i) {
        if (i >= n)
            return;
        int largest;
        int left = (2 * i + 1);
        int right = (2 * i + 2);
        if (arr[i] < arr[left]) {
            largest = left;
        }
        if (arr[i] < arr[right]) {
            largest = right;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            maxHeapify(arr, n, largest);
        }
    }

    public static void mergeHeaps(int[] arr, int[] a, int[] b, int n, int m) {
        for (int i = 0; i < n; i++) {
            merged[i] = a[i];
        }
        for (int j = 0; j < m; j++) {
            merged[n + j] = b[j];
        }

        n = n + m;
        for (int k = (n / 2 - 1); k >= 0; k--) {
            maxHeapify(merged, n, k);
        }
    }

    public static void main(String[] args) {
        int[] a = { 10, 5, 6, 2 };
        int[] b = { 12, 7, 9 };
        int n = a.length;
        int m = b.length;

        int[] merged = new int[n + m];

        mergeheaps(merged, a, b, n, m);

        for (int i = 0; i < n + m; i++) {
            System.out.println(merged[i] + " ");
        }
    }
}