package ca.ualberta.cs.lonelytwitter;

/**
 * Created by kehanwang on 2018/1/19.
 */

import java.util.Date;

public class NormalTweet extends Tweet {
    NormalTweet(String message){
        super(message);

    }

    NormalTweet(String message, Date date){
        super(message,date);
    }

    @Override
    public boolean isImportant(){
        return false;
    }
}