// Java implementation of recursive Binary Search
class BinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    public static int binarySearch(int[] arr, int l, int r, int x)
    {
        System.out.println("+1");
        if (r >= l) {
            int mid = l + (r - l) / 2;
            System.out.println(mid);
            System.out.println(arr[mid]);

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    // Driver method to test above
    public static void main(String[] args)
    {
        int[] arr = { 2, 4, 6, 7, 9, 12, 15, 18, 21, 24 };
        int n = arr.length;
        int x = 2;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }
}