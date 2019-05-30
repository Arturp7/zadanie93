public class CalendarConverter {
    final static int  MONDAY = 1;
    final static int TUESDAY = 2;
    final static int WEDNESDAY = 3;
    final static int THURSDAY = 4;
    final static int FRIDAY = 5;
    final static int SATURDAY = 6;
    final static int SUNDAY = 7;


     static String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case CalendarConverter.MONDAY :
                return "Poniedziałek";
            case CalendarConverter.TUESDAY :
                return "Wtorek";
            case CalendarConverter.WEDNESDAY:
                return "Sroda";
            case CalendarConverter.THURSDAY:
                return "Czwartek";
            case CalendarConverter.FRIDAY:
                return "Piątek";
            case CalendarConverter.SATURDAY:
                return "Sobota";
            case CalendarConverter.SUNDAY:
                return "Niedziela";
            default:
                return "Nieznany dzień";
        }
    }
}
