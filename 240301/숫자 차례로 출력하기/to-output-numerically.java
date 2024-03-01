import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printing(n);
        System.out.println();
        printing2(n);
    }
    public static void printing(int n){
        if(n==0){
            return;
        }
        printing(n-1);
        System.out.printf("%d ",n);
    }
    public static void printing2(int n){
        if(n==0){
            return;
        }
        System.out.printf("%d ",n);
        printing2(n-1);
    }
}