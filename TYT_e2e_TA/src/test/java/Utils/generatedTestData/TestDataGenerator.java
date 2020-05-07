package Utils.generatedTestData;

import org.apache.commons.lang3.RandomStringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author King Neg
 */
public class TestDataGenerator {

    public TestDataGenerator(){
    }

    /**
     * This method return the actual date plus a number of days
     * to reach the target date
     *
     * @param numBerOfDaysInTheFuture
     * @return date in the future
     */
    public String getFutureDate(int numBerOfDaysInTheFuture) {
        Calendar calendar =  Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, numBerOfDaysInTheFuture);
        DateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy" );
        return formatter.format(calendar.getTime());
    }

    /**
     *
     * @return the date of today
     */
    public String getActualDate() {
        Calendar calendar =  Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 0);
        DateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy" );
        return formatter.format(calendar.getTime());
    }

    /**
     * This method generate a random Alpha numeric number in Uppercase
     * @param length invoice number length
     * @return
     */
    public  String getInvoiceNumber(int length) {
        return RandomStringUtils.randomAlphanumeric(length).toUpperCase();
    }

    /**
     * This method generate a random Licence number with the pattern
     * 2 Alphabetic + 3 Numeric + 2 Alphabetic
     *
     * @return
     */
    public  String getLicenceNumber() {
        String alpha1 = RandomStringUtils.randomAlphabetic(2).toUpperCase();
        String numeric = RandomStringUtils.randomNumeric(3).toUpperCase();
        String alpha2 = RandomStringUtils.randomAlphabetic(2).toUpperCase();
        return alpha1+numeric+alpha2;
    }

    /**
     * This method generate a distance from the length count
     * @param count
     * @return
     */
    public  String getDistance(int count) {
        return RandomStringUtils.randomNumeric(count);
    }

    public static void main(String[] args) {

        TestDataGenerator testDataGenerator = new TestDataGenerator();
        int days = 5;
        System.out.println("Date of Today");
        System.out.println(testDataGenerator.getActualDate());
        System.out.println();
        System.out.println("Date of Today + " + days);
        System.out.println(testDataGenerator.getFutureDate(days));
        System.out.println();
        System.out.println("Invoice Number");
        System.out.println(testDataGenerator.getInvoiceNumber(8));
        System.out.println();
        System.out.println("Licence Number");
        System.out.println(testDataGenerator.getLicenceNumber());
        System.out.println("Random vehicle VIN");
        System.out.println(VinGeneratorUtils.getRandomVin());



    }
}
