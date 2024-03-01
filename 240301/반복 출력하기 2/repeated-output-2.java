import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printing(n);
    }
    public static void printing(int n){
        if(n==0){
            return;
        }
        printing(n-1);
        System.out.println("HelloWorld");
    }
}