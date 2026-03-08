public class Books{
    protected int BookID;
    protected String BookName;
    protected String BookAuthor;
    protected String ISBN;
    protected double price;

    public Books(int id,String name,String author,String isbn,double pri){
        this.BookID = id;
        this.BookName = name;
        this.BookAuthor = author;
        this.ISBN = isbn;
        this.price = pri;
    }
}