package utilityclass;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;




public class test7 {
    public static void main(String[] args) {
        Date currenDate = new Date();
        System.out.println(currenDate);

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(day + "/" + (month + 1) + "/" + year);

        cal.add(Calendar.MONTH, -1);
        cal.add(Calendar.DATE, 5);

        System.out.println(cal.getTime());
    }
}
