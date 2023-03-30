package InsertionSort;

public class InsertionSort {

    public static void main(String[] args) {
//        int arr[] = {2, 6, 1, 9, 4, 3, 0, 5};
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (arr.length - 1));
        }
        long startTime = System.nanoTime();

        insertionSort(arr);

        long end = (System.nanoTime() - startTime) / 1000000;
        System.out.println("Time taken for Selection sort " + end + " ms" + "( " + (double) end / 1000 + " s)");

//        for (int x : arr) {
//            System.out.println(x);
//        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

}
