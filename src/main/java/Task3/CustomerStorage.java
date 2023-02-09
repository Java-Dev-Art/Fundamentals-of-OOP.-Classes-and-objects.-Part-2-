package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerStorage {
    private List<Customer> customers;
    private Customer customer;

    public CustomerStorage(Customer customer) {
        this.customers = new ArrayList<>();
        this.customer = customer;
        addCustomer(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public CustomerStorage(List<Customer> customers) {
        this.customers = customers;
    }

    private void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void findCustomer(Customer customer) {
        for (Customer customer1 : customers) {
            if (customer1.equals(customer)) {
                System.out.println(customer.getSurname() + " " + customer.getFirstName());
            }
        }
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }
}
