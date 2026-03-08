public class Main {
    
    public static void main(String[] args) {
        Category c1 = new Category(1, "Java Programming", "James Gosling", "978-0-13-468599-1", 49.99, "Java");
        Category c2 = new Category(2, "The C Programming Language", "Dennis Ritchie", "978-0-13-110362-7", 39.99, "C");
        Category c3 = new Category(3, "C++ Primer", "Stanley Lippman", "978-0-32-174113-1", 59.99, "C++");

        System.out.println("LIBRARY MANAGMENT SYSTEM \n");
        c1.display();
        c2.display();
        c3.display();

        Books upcastedc1 = (Books) c1;
        Books upcastedc2 = (Books) c2;
        Books upcastedc3 = (Books) c3;

        System.out.println("After Upcasting ");
        System.out.println("Book 1 ID: " + upcastedc1.BookID + ", Name: " + upcastedc1.BookName + ", Price: " + upcastedc1.price);
        System.out.println("Book 2 ID: " + upcastedc2.BookID + ", Name: " + upcastedc2.BookName + ", Price: " + upcastedc2.price);
        System.out.println("Book 3 ID: " + upcastedc3.BookID + ", Name: " + upcastedc3.BookName + ", Price: " + upcastedc3.price);
    }
}
