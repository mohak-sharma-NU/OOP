public class PortfolioAnalyzer {
    

    public static double[] calDailyProfitLoss(double[] opening,double[] closing,double[] result){

        for (int i = 0; i < closing.length; i++) {
            result[i] = closing[i] - opening[i];
        }

        return result;
    }

    public static void print(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {

        double[] opening = {10.0,12.5,8.0,15.0};
        double[] closing = {11.0,13.0,7.0,16.0};
        double[] result = new double[opening.length];

        result = calDailyProfitLoss(opening,closing,result);


        print(result);

    }
}