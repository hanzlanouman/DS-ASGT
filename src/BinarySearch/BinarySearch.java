package BinarySearch;

public class BinarySearch {


    public static void main(String[] args) {
        int arr[] = new int[1000];

        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = i;
        }

        int target = 8;
        int start = 0;
        int end = arr.length - 1;
        int flag = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = arr[mid];

            if (value > target) {
                end = mid - 1;
            } else if (value < target) {
                start = mid + 1;
            } else {
                System.out.println("Target Found at: " + mid);
                flag++;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Target Not found");
        }

    }

}
