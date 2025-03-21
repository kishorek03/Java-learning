package Array_Problems;
import Helper_Classes.ScannerHelper;

public class BinarySearch {
    public static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void binarySearch1(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value) {
                System.out.println("Value found at index: " + mid);
                return;
            }
            if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Value not found");
    }
    static int recursiveBinarySearch(int arr[], int low, int high, int x)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return recursiveBinarySearch(arr, low, mid - 1, x);
            return recursiveBinarySearch(arr, mid + 1, high, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = ScannerHelper.getInputInts();
        int valueToSearch = 5;
        int result = binarySearch(arr, valueToSearch);
        int result1=recursiveBinarySearch(arr,0,arr.length-1,5);
        if (result1 != -1) {
            System.out.println("binarySearch: Value found at index " + result1);
        } else {
            System.out.println("binarySearch: Value not found");
        }
        if (result != -1) {
            System.out.println("binarySearch: Value found at index " + result);
        } else {
            System.out.println("binarySearch: Value not found");
        }
        binarySearch1(arr, valueToSearch);
    }
}
