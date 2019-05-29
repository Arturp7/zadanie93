public class CalendarConverter {
    static int MONDAY = 1;
    static int TUESDAY = 2;
    static int WEDNESDAY = 3;
    static int THURSDAY = 4;
    static int FRIDAY = 5;
    static int SATURDAY = 6;
    static int SUNDAY = 7;


    static String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Poniedziałek";
            case 2:
                return "Wtorek";
            case 3:
                return "Sroda";
            case 4:
                return "Czwartek";
            case 5:
                return "Piątek";
            case 6:
                return "Sobota";
            case 7:
                return "Niedziela";
            default:
                return "Nieznany dzień";
        }
    }
}
