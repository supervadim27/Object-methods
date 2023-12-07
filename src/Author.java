public class Author {
    public String firstName;
    public String lastName;
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getName() {
        return firstName;
    }
    public String getSurname() {
        return lastName;
    }
    public String toString() {
        return firstName + " " + lastName;
    }
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }
    public int hashCode() {
        int result = 17;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}