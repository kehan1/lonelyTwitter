package ca.ualberta.cs.lonelytwitter;

/**
 * Created by kehanwang on 2018/1/19.
 */

import java.util.Date;
import java.util.ArrayList;

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;


    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public class moodlist{
        public static void main(String mood) {
            ArrayList mood = new ArrayList();
            mood.add(mood);
        }
    }

    public Date getDate(){
        return date;

    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract boolean isImportant();
}