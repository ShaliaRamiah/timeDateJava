import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TimeStamp {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
    public static void main(String[] args) {
      Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
        Date date = new Date();
        System.out.println(new Timestamp(date.getTime()));
        System.out.println(timestamp.getTime());
        System.out.println(sdf.format(timestamp));
    }
}