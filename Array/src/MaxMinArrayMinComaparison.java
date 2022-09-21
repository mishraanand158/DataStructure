public class MaxMinArrayMinComaparison {

    /* Driver progra
    m to test above function */
    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);

      /*  output ## Minimum element is 1
                    Maximum element is 3000*/


    }

    private static Pair getMinMax(int[] arr, int arr_size) {
        Pair minmax = new Pair();
        if (arr_size == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        minmax.max = -999999999;
        minmax.min = 999999999;
        for (int val : arr) {
            if (val > minmax.max)
                minmax.max = val;
            if (val < minmax.min)
                minmax.min = val;
        }
        return minmax;
    }

    static class Pair {
        int min;
        int max;
    }
}
