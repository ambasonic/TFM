package Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtilsMR {

    public static String getFutureDate(int numBerOfDaysInTheFuture) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, numBerOfDaysInTheFuture);
        DateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy" );
        return formatter.format(calendar.getTime());
    }
}
