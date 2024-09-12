public class Main {
    public static void main(String[]args){

        Library library = new Library();
        Book book1 = new PhysicalBook("The Hobbit", "J.R.R. Tolkien", 12.99, 0.5);
        Book book2 = new DigitalBook("The Lord of the Rings", "J.R.R. Tolkien", 29.99, 0.5);
        Book book3 = new PhysicalBook("Harry Potter", "J.K. Rowling", 29.99, 0.5);

        library.add(book1);
        library.add(book2);
        library.add(book3);

        library.showAll();
    }
}
