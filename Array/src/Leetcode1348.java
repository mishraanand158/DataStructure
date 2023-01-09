import java.util.*;

/**
 * A social media company is trying to monitor activity on their site by analyzing the number of tweets that occur in select periods of time. These periods can be partitioned into smaller time chunks based on a certain frequency (every minute, hour, or day).
 * <p>
 * For example, the period [10, 10000] (in seconds) would be partitioned into the following time chunks with these frequencies:
 * <p>
 * Every minute (60-second chunks): [10,69], [70,129], [130,189], ..., [9970,10000]
 * Every hour (3600-second chunks): [10,3609], [3610,7209], [7210,10000]
 * Every day (86400-second chunks): [10,10000]
 * Notice that the last chunk may be shorter than the specified frequency's chunk size and will always end with the end time of the period (10000 in the above example).
 * <p>
 * Design and implement an API to help the company with their analysis.
 * <p>
 * Implement the TweetCounts class:
 * <p>
 * TweetCounts() Initializes the TweetCounts object.
 * void recordTweet(String tweetName, int time) Stores the tweetName at the recorded time (in seconds).
 * List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) Returns a list of integers representing the number of tweets with tweetName in each time chunk for the given period of time [startTime, endTime] (in seconds) and frequency freq.
 * freq is one of "minute", "hour", or "day" representing a frequency of every minute, hour, or day respectively.
 * Input
 * ["TweetCounts","recordTweet","recordTweet","recordTweet","getTweetCountsPerFrequency","getTweetCountsPerFrequency","recordTweet","getTweetCountsPerFrequency"]
 * [[],["tweet3",0],["tweet3",60],["tweet3",10],["minute","tweet3",0,59],["minute","tweet3",0,60],["tweet3",120],["hour","tweet3",0,210]]
 * <p>
 * Output
 * [null,null,null,null,[2],[2,1],null,[4]]
 */
public class Leetcode1348 {
    public static void main(String[] args) {

    }
    Map<String, List<Integer>> map = new HashMap<>();

    public Leetcode1348() {

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

        for (int val : tweetTimeList) {

        }

        return tweetList;
    }
}
