public class Category extends Books{
    
    protected String category;

    public Category(int BookID,String BookName,String BookAuthor,String ISBN,double price,String cat){
        super(BookID, BookName, BookAuthor, ISBN, price);
        this.category = cat;
    }

    public void display(){
        System.out.println("\nBOOK DETAILS: \nBOOK ID: "+this.BookID+
            "\nBOOK NAME: "+this.BookName+
            "\nBOOK AUTHOR: "+this.BookAuthor+
            "\nBOOK ISBN: "+this.ISBN+
            "\nPRICE: "+this.price+
            "\nCategory: "+this.category+"\n"
        );
    }

}
