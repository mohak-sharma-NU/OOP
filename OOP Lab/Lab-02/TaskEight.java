public class TaskEight {
    
    public static void main(String[] args) {
        int n=100,evenSum=0,oddSum=0;
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                evenSum+=i;
            }else{
                oddSum+=i;
            }
        }

        System.out.println("Even Sum: "+evenSum+"\nOdd Sum: "+oddSum);
    }
}
