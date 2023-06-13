package MergeSort;

import BubbleSort.BubbleSort;

public class MergeSort {


    public static void main(String[] args) throws InterruptedException {
        int[] arr = {2, 6, 1, 9, 4, 5, 0, 3};
        // Assignment Condition
//        int[] arr = new int[100000];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * arr.length - 1);
//        }

        mergeSort(arr);
        for (int x : arr) {
            System.out.println(x);
        }
    }


    public static void merge(int[] leftArray, int[] rightArray, int[] arr) {

        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;

        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                arr[i] = leftArray[l];
                i++;
                l++;
            } else {
                arr[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            arr[i] = leftArray[l];
            i++;
            l++;
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


        int i = 0, j = 0;
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
