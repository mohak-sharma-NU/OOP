import java.util.Scanner;

public class Quiz {
  
    Scanner input = new Scanner(System.in);

    private String[] questions = new String[10];
    private String[] cAnswers = new String[10];
    private String[] uAnswers = new String[10];

    public void addQuestions(){
    System.out.println("Add questions with answers: (In question, a) ans b) ans c) ans format)");
        for (int i = 0; i < questions.length; i++) {
            System.out.printf("Enter question no %d with answers: ",i+1);
            questions[i] = input.next();
            System.out.println("Add the correct answer key:");
            cAnswers[i] = input.next();
        }
    }

    public void addQuestion(int i,String question){
        questions[i] = question;
    }
    public void addAnswer(int i,String answer){
        cAnswers[i] = answer;
    }

    public boolean checkAnswer(int i,String a){
        if (cAnswers[i].equals(a)) {
            return true;
        }else{
            return false;
        }
    }

    public void askQuestions(){
        for (int i = 0; i < questions.length; i++) {
            System.out.printf("Q%d: %s",i+1,questions[i]);
            uAnswers[i] = input.next();
        }
    }

    public int score(){
        
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            if (checkAnswer(i, uAnswers[i])) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args){

        Quiz q1 = new Quiz();

        q1.addQuestion(0,"The Capital of France? \na)Lyon \nb)Nice \nc)Paris\n");
        q1.addAnswer(0, "c");

        q1.addQuestion(1,"The Capital of Brazil? \na)Rio de Janeiro \nb)Brasilia \nc)Sao Paulo\n");
        q1.addAnswer(1, "b");

        q1.addQuestion(2,"The Capital of Japan? \na)Osaka \nb)Kyoto \nc)Tokyo\n");
        q1.addAnswer(2, "c");

        q1.addQuestion(3,"The Capital of Italy, known for ancient ruins? \na)Milan \nb)Rome \nc)Venice\n");
        q1.addAnswer(3, "b");

        q1.addQuestion(4,"The Capital of Pakistan? \na)Lahore \nb)Karachi \nc)Islamabad\n");
        q1.addAnswer(4, "c");

        q1.addQuestion(5,"The Capital of Turkey? \na)Istanbul \nb)Ankara \nc)Izmir\\n");
        q1.addAnswer(5, "b");

        q1.addQuestion(6,"The Capital of Egypt, home to rich ancient culture? \na)Giza \nb)Alexandria \nc)Cairo\\n");
        q1.addAnswer(6, "c");

        q1.addQuestion(7,"The Capital of Australia? \na)Sydney \nb)Melbourne \nc)Canberra\\n");
        q1.addAnswer(7, "c");

        q1.addQuestion(8,"The Capital of Germany? \na)Munich \nb)Frankfurt \nc)Berlin\\n");
        q1.addAnswer(8, "c");

        q1.addQuestion(9,"The Capital of China? \na)Shanghai \nb)Beijing \nc)Guangzhou\\n");
        q1.addAnswer(9, "b");

        q1.askQuestions();

        System.out.println("You Scored: "+q1.score());
    }
}
