package ca.ualberta.cs.lonelytwitter;

/**
 * Created by kehanwang on 2018/1/19.
 */

public interface Tweetable {
    String getMessage();
    void setMessage(String message) throws TweetTooLongException;
}