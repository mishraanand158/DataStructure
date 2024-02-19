class Solution {
    public int minSteps(String s, String t) {

            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();

            if (s.length() != t.length())
                return 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (map1.containsKey(c)) {
                    map1.put(c, map1.get(c) + 1);
                } else {
                    map1.put(c, 1);
                }
            }

            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);

                if (map2.containsKey(c)) {
                    map2.put(c, map2.get(c) + 1);
                } else {
                    map2.put(c, 1);
                }
            }

           
            // Set<Map.Entry<Character, Integer>> entries = map1.entrySet();
            for (Map.Entry<Character, Integer> entries : map1.entrySet()) {

                char c = entries.getKey();
                int value = entries.getValue();

                if (map2.containsKey(c)) {
                    int map2_val = map2.get(c);
                    map2_val = map2_val - Math.min(map2_val, value);

                    if (map2_val == 0)
                        map2.remove(c);
                    else
                        map2.put(c, map2_val);

                }
            }

            int result = 0;
            for (Map.Entry<Character, Integer> entries : map2.entrySet())
                result += entries.getValue();

            System.out.println(map2);
            System.out.println(result);
            return result;
        }
}