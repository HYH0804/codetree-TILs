import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%d",ret(n));
    }
    public static int ret(int n){
        if(n<=0){
            return 0;
        }
        else if(n%2==0){
            return n+ret(n-2);
        }
        else{
            return n+ret(n-2);
        }
    }
}