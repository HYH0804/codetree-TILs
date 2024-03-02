import java.util.Scanner;

public class Main {    
    // n의 각 자릿수의 합을 반환합니다.
    public static int digitSum(int n) {
        if(n < 10)
            return n;
    
        return digitSum(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력:
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(digitSum(a * b * c));
    }
}