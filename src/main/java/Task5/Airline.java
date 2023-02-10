package Task5;

import java.util.Comparator;
import java.util.Objects;

public class Airline implements Comparator<Airline>,Comparable<Airline> {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private String departureTime;
    private DaysOfWeek daysOfWeek;

    public Airline(String destination, int flightNumber, String aircraftType, String departureTime, DaysOfWeek daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DaysOfWeek daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public int compare(Airline o1, Airline o2) {
        return o1.getFlightNumber() - o2.getFlightNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return flightNumber == airline.flightNumber && Objects.equals(destination, airline.destination) && Objects.equals(aircraftType, airline.aircraftType) && Objects.equals(departureTime, airline.departureTime) && daysOfWeek == airline.daysOfWeek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flightNumber, aircraftType, departureTime, daysOfWeek);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", daysOfWeek=" + daysOfWeek +
                '}';
    }

    @Override
    public int compareTo(Airline o) {
        return (this.getDestination()).compareTo(o.getDestination());
    }

}
