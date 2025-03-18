package practice.interviewQuestions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateFormat {
    public static void main(String[] args){
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/YYYY,HH:mm:ss");
        System.out.println(date.format(new Date()));
    }
}
