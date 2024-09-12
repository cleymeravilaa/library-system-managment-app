public class PhysicalBook extends Book {
    private double weight; // in kilograms

    public PhysicalBook(String title, String author, double price, double weight){
        super(title, author, price);
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    @Override
    public void showInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
    }
}
