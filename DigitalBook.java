public class DigitalBook extends Book {
    private double fileSize; // in megabytes

public DigitalBook(String title, String author, double price, double fileSize){
        super(title, author, price);
        this.fileSize = fileSize;
    }

    public double getfileSize(){
        return fileSize;
    }

    @Override
    public void showInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("fileSize: " + fileSize);
    }
}
