package Assignments.A1;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ImportTime {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(date.format(today));
    }
}

