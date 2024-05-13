import java.sql.SQLOutput;

enum WeekDay{
    Monday,Tuesday, Wednesday,Thursday,Friday,Saturday,Sunday;
}
public class EnumDemo {
    public static void main(String[] args) {
        WeekDay day = WeekDay.Wednesday;
        System.out.println("today is" + day);
        System.out.println("All weekdays :");
        for(WeekDay d :WeekDay.values()){
            System.out.println(d);
        }
    }
}
