package Task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "Art", "MAr", "Mich", "Minsk", 1234, 1234),
                new Customer(2, "Bar", "Kos", "Mich", "Pinsk", 12355554, 12555534),
                new Customer(3, "Top", "Rad", "Polich", "Grodno", 111111234, 111111234),
                new Customer(4, "Poliu", "Mogr", "Kulich", "Minsk", 177777234, 12377774),
                new Customer(5, "Kul", "Raw", "Mo", "War", 12999934, 12777734)
        );
        CustomerStorage customerStorage = new CustomerStorage(customers);
        customerStorage.findCustomer(new Customer(2, "Bar", "Kos", "Mich", "Pinsk", 12355554, 12555534));
        PrintCustomer printCustomer = new PrintCustomer(customerStorage);
        printCustomer.printAll();
    }
}
