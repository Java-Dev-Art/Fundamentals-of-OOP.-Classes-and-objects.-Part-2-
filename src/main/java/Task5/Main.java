package Task5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Airline> airlines = Arrays.asList(
                new Airline("Mins",0123,"boig","13:40",DaysOfWeek.FRIDAY),
                new Airline("Kiev",1123,"boig","13:40",DaysOfWeek.MONDAY),
                new Airline("Warsaw",2123,"boig","13:40",DaysOfWeek.FRIDAY),
                new Airline("Vilnius",3123,"boig","13:40",DaysOfWeek.MONDAY),
                new Airline("Oszmiana",4123,"boig","13:40",DaysOfWeek.WEDNESDAY)
        );
        StorageOfAirline airline = new StorageOfAirline(airlines);
        System.out.println(airline.getAirlineOnDestination("Oszmiana"));
        System.out.println(airline.getAirlineOnDaysOfWeek(DaysOfWeek.FRIDAY));
    }
}
