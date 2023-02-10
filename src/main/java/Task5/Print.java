package Task5;

import java.util.Arrays;
import java.util.List;

public class Print {
    private Airline airline;
    private List<Airline> airlines;

    public Print(Airline airline, List<Airline> airlines) {
        this.airline = airline;
        this.airlines = airlines;
    }

    public Print(Airline airline) {
        this.airline = airline;
    }

    public Print(List<Airline> airlines) {
        this.airlines = airlines;
    }
    public void printAirlines(){
        System.out.println(airline);
    }
    public void printAirlines(Airline airline){
        System.out.println(airline);
    }
    public void printAllArline(){
        System.out.println(Arrays.toString(airlines.toArray()));
    }
}
