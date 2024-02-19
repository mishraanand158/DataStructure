class Solution {
    public int mySqrt(int x) {

        int low = 1;
        int high = x;

        int mid = 0; // 5
        // mid = (low +high )/2 ; //1

        boolean rBool = true;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid  > x/mid) {
                high = mid - 1; // 3
            } else if (mid < x/mid) {
                low = mid + 1; // 2
            } else {
                return mid;
            }

        }
        return low - 1;

    }
}