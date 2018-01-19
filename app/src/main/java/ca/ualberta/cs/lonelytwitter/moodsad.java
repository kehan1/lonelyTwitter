package ca.ualberta.cs.lonelytwitter;

/**
 * Created by kehanwang on 2018/1/19.
 */
import java.util.Date;

public class moodsad extends mood{

    public moodsad(Date date){
        super(date);
    }

    public String getmood(){
        return "sad";
    }

}

