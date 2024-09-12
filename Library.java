import java.util.ArrayList;

public class Library implements Inventoriable {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<Book>();
    }

    public void add(Book book){
        books.add(book);
    }

    public void remove(Book book){
        books.remove(book);
    }

    public void showAll(){
        for(Book book : books){
            book.showInfo();
        }
    }
}
