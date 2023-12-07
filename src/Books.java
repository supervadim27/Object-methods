public class Books {
    private String title;
    private int year;
    private Author author;

    public Books (String title, int year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public Author getAuthor() {
        return author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return title + " (" + year + ") by " + author.toString();
    }
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Books)) {
            return false;
        }
        Books book = (Books) obj;
        return title.equals(book.title) && year == book.year && author.equals(book.author);
    }
    public int hashCode() {
        int result = 17;
        result = 31 * result + title.hashCode();
        result = 31 * result + year;
        result = 31 * result + author.hashCode();
        return result;
    }
}



