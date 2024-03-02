import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.printf("%d",f(n));
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else{
            return f(n-1)+f(n/3);
        }
    }
}