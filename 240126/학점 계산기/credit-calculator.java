import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        double[] array = new double[n];
        double sumVal=0;
        for (int i=0; i<n; i++){
            array[i]=sc.nextDouble();
            sumVal+=array[i];
        }
        double avg= (double)sumVal/array.length;
        System.out.printf("%.1f\n",avg);
        if (avg>=4.0){
            System.out.printf("Perfect");
        }
        else if(avg>=3.0){
            System.out.printf("Good");
        }
        else {
            System.out.printf("Poor");
        }
    }
}