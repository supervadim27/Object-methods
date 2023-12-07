public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание №1");

        Author author1 = new Author("William", "Shakespire");
        Author author2 = new Author("Robert Louis", "Stevenson");
        Books books1 = new Books("Romeo & Julliet", 1595, author1);
        Books books2 = new Books("Treasure Island", 1883, author2);

        System.out.println(books1.getTitle() + ", published in " +books1.getYear() + " by " +books1.getAuthor().getName() + " " + books1.getAuthor().getSurname());
        System.out.println(books2.getTitle() + ", published in " +books2.getYear() + " by " +books2.getAuthor().getName() + " " + books2.getAuthor().getSurname());

    }
}
