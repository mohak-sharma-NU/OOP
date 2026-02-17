import java.util.Scanner;

public class ProgLanguage {
    
    Scanner input = new Scanner(System.in);

    private String language;

    public ProgLanguage(){
        this.language = "JAVA";
    }

    public ProgLanguage(String l){
        this.language = l;
    }
    public String getLanguage(){return this.language;}

    public void Display(){
        System.out.println("Language: "+this.language);
    }
    public static void main(String[] args) {
        ProgLanguage p1 = new ProgLanguage();
        ProgLanguage p2 = new ProgLanguage("C");

        p1.Display();
        p2.Display();        
    }
}