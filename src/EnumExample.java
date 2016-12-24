public class EnumExample {
    public enum Day { // definition
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    Day day; // variable declaration

    public EnumExample(Day day) { // constructor
        this.day = day;
    }

    public void desiredFunctionality() { // that's what I want
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are great !");
                break;
            case FRIDAY:
                System.out.println("Fridays are amazing !");
                break;
            case SATURDAY:
            case SUNDAY:
            case WEDNESDAY:
                System.out.println("This is a multi-choice ! ");
                break;
            default:
                System.out.println("THURSDAY and TUESDAY are left!");
        }
    }
}
