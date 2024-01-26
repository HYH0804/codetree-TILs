import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumVal=0;
        int a = sc.nextInt();
        for(int i =1; i<a; i++){
            if (a%i==0){
                sumVal+=i;
            }
        }
        if (sumVal == a){
            System.out.println("P");
        }
        else{
            System.out.println("N");
        }
    }
}