package Arrays;

// Java program to find union and intersection
// using Hashing
import java.util.HashSet;

class Test {
    // Prints union of arr1[0..m-1] and arr2[0..n-1]
    static void printUnion(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
        for (int i = 0; i < arr2.length; i++)
            hs.add(arr2[i]);
        System.out.println(hs);
    }

    // Prints intersection of arr1[0..m-1] and arr2[0..n-1]
    static void printIntersection(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);

        for (int i = 0; i < arr2.length; i++)
            if (hs.contains(arr2[i]))
                System.out.print(arr2[i] + " ");
    }

    // Driver code
    public static void main(String[] args) {
        int arr1[] = { 7, 1, 5, 2, 3, 6 };
        int arr2[] = { 3, 8, 6, 20, 7 };

        // Function call
        System.out.println("Union of two arrays is : ");
        printUnion(arr1, arr2);

        System.out.println(
                "Intersection of two arrays is : ");
        printIntersection(arr1, arr2);
    }
}
