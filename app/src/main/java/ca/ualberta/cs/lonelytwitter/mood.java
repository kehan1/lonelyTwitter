package ca.ualberta.cs.lonelytwitter;

/**
 * Created by kehanwang on 2018/1/19.
 */

import java.util.Date;


public abstract class mood {
    private Date date;

    public mood(){
        this.date = new Date();
    }

    public mood(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(){
        this.date = date;
    }

    public abstract String getmood();

}
