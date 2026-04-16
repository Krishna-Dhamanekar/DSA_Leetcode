# Problem: Quicksort

## Approach
Used divide and conquer...

## Complexity
Time: O(n log n)
Space: O(log n)

public class QuickSort {

    public static void quick(int[] arr, int l, int r) {
        if (l < r) {
            int p = partition(arr, l, r);
            quick(arr, l, p - 1);
            quick(arr, p + 1, r);
        }
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[l];
        int i = l + 1;
        int j = r;

        while (true) {

            while (i <= j && arr[i] <= pivot) {
                i++;
            }

            while (i <= j && arr[j] >= pivot) {
                j--;
            }

            if (i <= j) {
                swap(arr, i, j);
            } else {
                break;
            }
        }

        swap(arr, l, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 1, 4, 2, 7, 8, 10};

        quick(a, 0, a.length - 1);

        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}