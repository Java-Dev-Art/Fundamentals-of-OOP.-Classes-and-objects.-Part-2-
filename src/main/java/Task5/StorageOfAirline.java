package Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StorageOfAirline {
    private List<Airline> airlines;

    public StorageOfAirline(List<Airline> airlines) {
        this.airlines = airlines;
        Collections.sort(airlines);
    }
    public Airline getAirlineOnDestination(String destination){
        int index = 0;
        for (int i =0; i< airlines.size(); i++){
            if (destination.equals(airlines.get(i).getDestination())){
                index = i;
            }
        }
        return airlines.get(index);
    }
    public List<Airline> getAirlineOnDaysOfWeek(DaysOfWeek daysOfWeek){
        List<Airline>airlineList = new ArrayList<>();
        for (int i =0; i< airlines.size(); i++){
            if (daysOfWeek.equals(airlines.get(i).getDaysOfWeek())){
                airlineList.add(airlines.get(i));
            }
        }
        return airlineList;
    }
}
