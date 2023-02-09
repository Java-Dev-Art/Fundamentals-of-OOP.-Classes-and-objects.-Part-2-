package Task2;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.Callable;

public class Train implements Comparable<Train>, Comparator<Train> {
    private String destinationName;
    private int trainNumber;
    private Date departureTime;

    public Train(String destinationName, int trainNumber, Date departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public int compare(Train o1, Train o2) {
        return o1.getTrainNumber() - o2.getTrainNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber && Objects.equals(destinationName, train.destinationName) && Objects.equals(departureTime, train.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationName, trainNumber, departureTime);
    }

    @Override
    public String toString() {
        return "Train{" +
                "destinationName='" + destinationName + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime=" + departureTime +
                '}';
    }

    @Override
    public int compareTo(Train o) {
        return (this.getDestinationName()).compareTo(o.getDestinationName());
    }
}
