import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean isPrime = false;
        for(int i=2; i<a; i++){
            if(a%i==0){
                isPrime=true;
            }
        }
        if(isPrime==true){
            System.out.println("C");
        }
        else{
            System.out.println("N");
        }
    }
}