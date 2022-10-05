import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SortArrayWith012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputline[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputline[i]);
            }
            Solution1 ob = new Solution1();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for (int i = 0; i < n; i++) {
                str.append(arr[i]).append(" ");
            }
            System.out.println(str);
        }
    }
}

class Solution1 {
    public void sort012(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>(3);
        for (int value : arr) {
            if (map.containsKey(value)) map.put(value, map.get(value) + 1);
            else map.put(value, 1);
        }

        int zero = map.get(0);
        int one = map.get(1);
        int two = map.get(2);

        for (int i = 0; i < zero + one + two; i++) {
            if (i < zero) arr[i] = 0;
            else if (i < zero + one) arr[i] = 1;
            else arr[i] = 2;
        }
    }
}




















