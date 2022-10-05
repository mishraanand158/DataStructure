public class MoveAllNegativeNumber {

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, 11};
        int arr_size = arr.length;

        shiftall(arr, 0, arr_size - 1);

        for (int val : arr)
            System.out.print(val + " ");
    }

    private static void shiftall(int[] arr, int left, int right) {

        while (left <= right) {

            if (arr[left] < 0 && arr[right] < 0)
                left++;
            else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            } else {
                left++;
                right--;
            }

        }
    }

}
