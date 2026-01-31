import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount: \n");

        int a = input.nextInt();

        input.close();

        System.out.println("\n"+a);

        int freq[] = {0,0,0,0,0,0,0,0,0};

        int denom[] = {5000,1000,500,100,20,10,5,2,1};

        while(a>0){
                if (a>=5000) {
                a-=denom[0];
                freq[0]++;
            }else if(a>=1000) {
                a-=denom[1];
                freq[1]++;
            }else if(a>=500) {
                a-=denom[2];
                freq[2]++;
            }else if(a>=100) {
                a-=denom[3];
                freq[3]++;
            }else if(a>=20) {
                a-=denom[4];
                freq[4]++;
            }else if(a>=10) {
                a-=denom[5];
                freq[5]++;
            }else if(a>=5) {
                a-=denom[6];
                freq[6]++;
            }else if(a>=2) {
                a-=denom[7];
                freq[7]++;
            }else if(a>=1) {
                a-=denom[8];
                freq[8]++;
            }else{
                System.out.println("Reached zero.");
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i]>0) {
                System.out.println(denom[i]+": "+freq[i]+" note(s)");                
            }
        }
    }
}
