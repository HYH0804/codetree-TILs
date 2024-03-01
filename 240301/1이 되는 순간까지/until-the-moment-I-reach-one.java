import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력:
        int n = sc.nextInt();

        System.out.println(div(n));
    }
        public static int div(int n){
        if(n==1){
            return 0;
        }
        if(n%2==0){
            return div(n/2)+1;
        }
        else{
            return div(n/3)+1;
        }
    }
    }