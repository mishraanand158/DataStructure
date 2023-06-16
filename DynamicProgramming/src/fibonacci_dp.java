import java.util.Scanner;

public class fibonacci_dp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arr = new Integer[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        System.out.println(fibb(n, arr));
    }

    private static int fibb(int n, Integer[] arr) {

        if (n == 0 || n == 1) return arr[n];
        int first;
        int second;
        if (arr[n - 1] == null) {
            first = fibb(n - 1, arr);
        } else {
            first = arr[n - 1];
        }
        if (arr[n - 2] == null) {
            second = fibb(n - 2, arr);
        } else second = arr[n - 2];

        arr[n] = first + second;
        return first + second;

    }
}
