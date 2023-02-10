package Task5;

public enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");
    private final String daysOfWeek;

    DaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    @Override
    public String toString() {
        return "DaysOfWeek{" +
                "daysOfWeek='" + daysOfWeek + '\'' +
                '}';
    }
}
