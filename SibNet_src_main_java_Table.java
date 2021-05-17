import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Table {
    private String dateTable = "";
    public String dateURL;

    public String getNameTable(LocalDateTime getDate){
//        Date d = new Date();
        SimpleDateFormat date = null;
        date = new SimpleDateFormat("dd_MM_yyyy");

        Date dat = Date.from(getDate.atZone(ZoneId.systemDefault()).toInstant());


        return date.format(dat);
    }
}
