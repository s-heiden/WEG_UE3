package helpers;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class DateHelper {
    private static DateHelper ourInstance = new DateHelper();

    public static DateHelper getInstance() {
        return ourInstance;
    }

    private DateHelper() {
    }

    public LocalDateTime stringToDate(String dateInput){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
        try {
            return LocalDateTime.ofInstant(format.parse(dateInput).toInstant(), ZoneId.systemDefault());
        } catch (ParseException e) {
            return LocalDateTime.now();
        }
    }
}
