import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%d",recur(n));
    }
    public static int recur(int n){
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        else{
            return recur(n-1)+recur(n-2);
        }
    }
}