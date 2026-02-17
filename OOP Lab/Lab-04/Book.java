public class Book {
    private String Title;
    private String Author;
    private double Price;

    public Book(){
        this.Title = "";
        this.Author = "";
        this.Price = 0.00;
    }

    public void setTitle(String t){
        this.Title = t;
    }
    public void setAuthor(String a){
        this.Author = a;
    }
    public void setPrice(double p){
        this.Price = p;
    }

    public String getTitle(){return this.Title;}

    public String getAuthor(){return this.Author;}

    public double getPrice(){return this.Price;}

    public void Display(){
        System.out.println("Title: "+this.Title+", Author: "+this.Author+", Price: "+this.Price);
    }

    public static void main(String[] args) {
        
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1.setTitle("Atomic Habits");
        b1.setAuthor("James Clear");
        b1.setPrice(29.99);

        b2.setTitle("The Art of War");
        b2.setAuthor("Sun Tzu");
        b2.setPrice(15.99);

        b3.setTitle("Laws of Human Nature");
        b3.setAuthor("Robert Greene");
        b3.setPrice(35.99);

        b1.Display();
        b2.Display();
        b3.Display();

    }



}
