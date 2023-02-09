package Task3;

public class PrintCustomer {
    private CustomerStorage customerStorage;

    public PrintCustomer(CustomerStorage customerStorage) {
        this.customerStorage = customerStorage;
    }

    public void printAll() {
        customerStorage.getCustomers().stream().forEach(System.out::println);
    }
}
