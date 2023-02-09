package Task3;

import java.util.Comparator;
import java.util.Objects;

public class Customer implements Comparable<Customer>, Comparator<Customer> {
    private int id;
    private String surname;
    private String firstName;
    private String patronymic;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer(int id, String surname, String firstName, String patronymic, String address, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && creditCardNumber == customer.
                creditCardNumber && bankAccountNumber == customer.
                bankAccountNumber && Objects.equals(surname, customer.surname) && Objects.
                equals(firstName, customer.firstName) && Objects.equals(patronymic, customer.patronymic) && Objects.
                equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, firstName, patronymic, address, creditCardNumber, bankAccountNumber);
    }

    @Override
    public int compareTo(Customer o) {
        return (this.getSurname()).compareTo(o.getSurname());
    }
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getCreditCardNumber() - o2.getCreditCardNumber();
    }
}
