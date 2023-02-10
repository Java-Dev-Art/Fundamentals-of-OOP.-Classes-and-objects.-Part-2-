package Task4;

import java.util.Objects;

public class Author {
    private String surname;
    private String firstName;

    public Author(String surname, String firstName) {
        this.surname = surname;
        this.firstName = firstName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(surname, author.surname) && Objects.equals(firstName, author.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, firstName);
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
