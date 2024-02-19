import java.util.*;
class Solution {
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
           // System.out.println(sortedSet);

           // System.out.println(resultList);
            return resultList;
        }
}