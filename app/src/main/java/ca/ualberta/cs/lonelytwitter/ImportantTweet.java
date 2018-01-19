package ca.ualberta.cs.lonelytwitter;

/**
 * Created by kehanwang on 2018/1/19.
 */

import java.util.Date;

public class ImportantTweet extends Tweet{

    ImportantTweet(String message){
        super(message);
    }

    ImportantTweet(String message, Date date){
        super(message,date);
    }


    @Override
    public boolean isImportant(){
        return true;
    }
}