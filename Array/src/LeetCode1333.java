import java.util.*;

public class LeetCode1333 {

    /**
     * Given the array restaurants where  restaurants[i] = [idi, ratingi, veganFriendlyi, pricei, distancei].You have to filter the restaurants using three filters.
     * The veganFriendly filter will be either true (meaning you should only include restaurants with veganFriendlyi set to true) or false (meaning you can include any restaurant).
     * In addition, you have the filters maxPrice and maxDistance which are the maximum value for price and distance of restaurants you should consider respectively.
     * Return the array of restaurant IDs after filtering, ordered by rating from highest to lowest. For restaurants with the same rating, order them by id from highest to lowest.
     * For simplicity veganFriendlyi and veganFriendly take value 1 when it is true, and 0 when it is false.
     * <p>
     * Input: restaurants = [[1,4,1,40,10],[2,8,0,50,5],[3,8,1,30,4],[4,10,0,10,3],[5,1,1,15,1]], veganFriendly = 1, maxPrice = 50, maxDistance = 10
     * Output: [3,1,5]
     * Explanation:
     * The restaurants are:
     * Restaurant 1 [id=1, rating=4, veganFriendly=1, price=40, distance=10]
     * Restaurant 2 [id=2, rating=8, veganFriendly=0, price=50, distance=5]
     * Restaurant 3 [id=3, rating=8, veganFriendly=1, price=30, distance=4]
     * Restaurant 4 [id=4, rating=10, veganFriendly=0, price=10, distance=3]
     * Restaurant 5 [id=5, rating=1, veganFriendly=1, price=15, distance=1]
     * After filter restaurants with veganFriendly = 1, maxPrice = 50 and maxDistance = 10 we have restaurant 3, restaurant 1 and restaurant 5 (ordered by rating from highest to lowest).
     */
    public static void main(String[] args) {
        Solution s1 = new Solution();

        int[][] restaurants = {{1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4}, {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}};
        int veganFriendly = 0, maxPrice = 30, maxDistance = 3;
        s1.filterRestaurants(restaurants, veganFriendly, maxPrice, maxDistance);
    }

    static class Solution {
        public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {

            SortedSet<Map.Entry<Integer, int[]>> sortedSet = new TreeSet<Map.Entry<Integer, int[]>>(new Comparator<Map.Entry<Integer, int[]>>() {
                @Override
                public int compare(Map.Entry<Integer, int[]> o1, Map.Entry<Integer, int[]> o2) {
                    int[] second = o1.getValue();
                    int[] initial = o2.getValue();

                    if (initial[1] < second[1]) {
                        return -1;
                    } else if (initial[1] > second[1]) {
                        return +1;
                    } else if (o2.getKey() < o1.getKey()) return -1;

                    return +1;
                }
            });

            SortedMap<Integer, int[]> map = new TreeMap<>();
            for (int[] restaurant : restaurants) {

                if (veganFriendly == 0 && (maxPrice >= restaurant[3] && maxDistance >= restaurant[4])) {
                    map.put(restaurant[0], restaurant);
                } else if (1 == restaurant[2] && (maxPrice >= restaurant[3] && maxDistance >= restaurant[4]))
                    map.put(restaurant[0], restaurant);
            }

            sortedSet.addAll(map.entrySet());

            List<Integer> resultList = new ArrayList<>();

            sortedSet.stream().forEach(e -> resultList.add(e.getKey()));
            System.out.println(sortedSet);

            System.out.println(resultList);
            return resultList;
        }
    }
}
