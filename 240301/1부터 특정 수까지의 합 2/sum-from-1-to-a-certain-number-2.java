import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%d",fact(n));
    }
    public static int fact(int n){
        if(n==0){
            return 0;
        }
        return n+fact(n-1);
    }
}