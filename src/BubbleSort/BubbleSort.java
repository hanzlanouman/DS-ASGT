package BubbleSort;

public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
//        int[] arr = {6, 5, 2, 8, 3, 1};
// Assignment Condition
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length - 1);
        }
        long start = System.nanoTime();


        sort(arr);

//        printArray(arr);
        long end = (System.nanoTime() - start) / 1000000;
        System.out.println("Time taken for bubbleSort " + end + " ms" + "\t (" + end / 1000 + "s)");
    }
}


// Time Complexity of O(n^2)
// Space Complexity of O(n)
