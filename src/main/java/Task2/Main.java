package Task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class Main {
    public static void main(String[] args) {

        List<Train> trains = Arrays.asList(
          new Train("Minsk",1234,new Date()),
          new Train("Krakow",123444,new Date()),
          new Train("Warsawa",1111234,new Date()),
          new Train("Grodno",4441234,new Date()),
          new Train("Oszmiana",128834,new Date()),
          new Train("Kiev",1666234,new Date()),
          new Train("Vinica",6661234,new Date())

        );
        Collections.sort(trains);
        for (Train train: trains){
            System.out.println(train);
        }
    }
}
