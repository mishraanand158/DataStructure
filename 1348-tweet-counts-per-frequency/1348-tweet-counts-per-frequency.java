class TweetCounts {
Map<String, List<Integer>> map;
    public TweetCounts() {
        map = new HashMap<>();
    }
    
    public void recordTweet(String tweetName, int time) {
        if (map.containsKey(tweetName)) {
            map.get(tweetName).add(time);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(time);
            map.put(tweetName, list);
        }
    }
    
    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        List<Integer> tweetList = new ArrayList<>();
        if (!map.containsKey(tweetName)) return tweetList;

        List<Integer> tweetTimeList = map.get(tweetName);
        Collections.sort(tweetTimeList);
        //"minute", "hour", or "day"
        int duration = 0;
        if ("minute".equals(freq)) {
            duration = 60;

        } else if ("hour".equals(freq)) {
            duration = 60 * 60;
        } else if ("day".equals(freq)) {
            duration = 60 * 60 * 24;
        }

        int start_time = startTime;

        int end_time = Math.min(start_time + duration - 1, endTime);


        for (int iter = 0; start_time <= endTime; ) {    //0,60       0,59 ,60,60
            //0,10,60
            while (iter < tweetTimeList.size() && tweetTimeList.get(iter) < start_time) {
                iter++;
            }
            int count = 0;
            while (iter < tweetTimeList.size() && tweetTimeList.get(iter) <= end_time) {
                count++;
                iter++;
            }

            tweetList.add(count);
            start_time = end_time + 1;
            end_time = Math.min(end_time + duration , endTime);

        }

        return tweetList;
    }
}

/**
 * Your TweetCounts object will be instantiated and called as such:
 * TweetCounts obj = new TweetCounts();
 * obj.recordTweet(tweetName,time);
 * List<Integer> param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
 */