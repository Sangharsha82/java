public class EnumEg {
enum weekdays{
    sunday,monday,tuesday,wednesday,thursday,friday,saturday;
}

    public static void main(String[] args) {
        weekdays weekday = weekdays.sunday;
        if(weekday == weekdays.sunday ||weekday == weekdays.saturday)
        System.out.println("Today is weekend");
        else {
            System.out.println("today is weekday");
        }
    }
}
