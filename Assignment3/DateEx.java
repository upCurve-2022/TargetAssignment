import java.text.SimpleDateFormat;
import java.util.Date;
public class DateEx {
    public static void main(String[] args) {
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date d=new Date();
        System.out.println(f.format(d));
    }
}
