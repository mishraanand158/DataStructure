public class ReverseArray {
    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        revereseArray(arr, 0, 5);
        System.out.print("\nReversed array is \n");
        printArray(arr, 6);
        /*1 2 3 4 5 6
         *Reversed array is
         *6 5 4 3 2 1
         */
    }

    private static void printArray(int[] arr, int len) {
        for (int val : arr)
            System.out.print(val + " ");
    }

    private static void revereseArray(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
