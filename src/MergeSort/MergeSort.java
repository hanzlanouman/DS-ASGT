package MergeSort;

import BubbleSort.BubbleSort;

public class MergeSort {


    public static void main(String[] args) throws InterruptedException {
//        int[] arr = {2, 6, 1, 9, 4, 5, 0, 3};
        // Assignment Condition
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length - 1);
        }
        long start = System.nanoTime();
        mergeSort(arr);


        long end = (System.nanoTime() - start) / 1000000;
        System.out.println("Time taken for MergeSort " + end + " ms");

//        BubbleSort.printArray(arr);
    }


    public static void merge(int[] leftArray, int[] rightArray, int[] arr) {
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0, l = 0, r = 0; //counters for arr, leftArray and rightArray

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                arr[i] = leftArray[l];
                l++;
                i++;
            } else {
                arr[i] = rightArray[r];
                r++;
                i++;
            }
        }
        while (l < leftSize) {
            arr[i] = leftArray[l];
            l++;
            i++;
        }
        while (r < rightSize) {
            arr[i] = rightArray[r];
            r++;
            i++;
        }

    }

    public static void mergeSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) return;

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];
        int i = 0; //counter for leftArray
        int j = 0; // counter for rightArray
        for (; i < length; i++) {
            if (i < mid) {
                leftArray[i] = arr[i];
            } else {
                rightArray[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);
    }
}

//Time Complexity O(n log n) Quasilinear Time
//Space Complexity O(n) Linear Space
