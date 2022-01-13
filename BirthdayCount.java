import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

class BirthdayCount{
    public static void main(String[] args) {
        String array[]=getCurrentDate().split(":");
        LocalDate date1=LocalDate.of(1999,12,21);
        LocalDate date2=LocalDate.of(Integer.parseInt(array[2]),Integer.parseInt(array[1]),Integer.parseInt(array[0]));
        Period p =Period.between(date1, date2);
        System.out.println("Years = "+p.getYears());
        System.out.println("Months = "+p.getMonths());
        System.out.println("Days = "+p.getDays());
    }
    public static String getCurrentDate() {
        SimpleDateFormat SDFormat = new SimpleDateFormat("dd:MM:yyyy");
            return SDFormat.format(new Date());
    }
}