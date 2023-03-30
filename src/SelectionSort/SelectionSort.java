package SelectionSort;

public class SelectionSort {


    public static void main(String[] args) {
//        int arr[] = {2, 6, 1, 9, 4, 3, 0, 5};
        int arr[] = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (arr.length - 1));
        }
        long startTime = System.nanoTime();

        selectionSort(arr);

        long end = (System.nanoTime() - startTime) / 1000000;
        System.out.println("Time taken for Selection sort " + end + " ms" + "( " + (double) end / 1000 + " s)");
//        for (int x : arr) {
//            System.out.println(x);
//        }
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
