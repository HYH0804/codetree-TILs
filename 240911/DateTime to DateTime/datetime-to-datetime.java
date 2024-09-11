import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int start = minute(11, 11, 11);
        int end = minute(a, b, c);
        if(end>=start){
            System.out.println(end-start);
        }
        else {
            System.out.println(-1);
        }
    }
    public static int minute(int a , int b, int c){ //11월 1월 1일부터 11월 a일 b시 c분까지
        int diff = a*24*60+b*60+c;
        return diff;
    }
}