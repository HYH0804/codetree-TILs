import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int start = days(m1,d1);
        int end = days(m2, d2);
        int diff = end-start;
        while(diff<0){
            diff+=7;
        }
        switch (diff%7){
            case 0:
                System.out.println("Mon");
                break;
            case 1:
                System.out.println("Tue");
                break;
            case 2:
                System.out.println("Wed");
                break;
            case 3:
                System.out.println("Thu");
                break;
            case 4:
                System.out.println("Fri");
                break;
            case 5:
                System.out.println("Sat");
                break;
            case 6:
                System.out.println("Sun");
                break;
        }
    }
    public static int days(int a , int b){ //1월 1일부터  a월 b일
        int[] days = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int total = 0 ;
        for(int i=1; i<a;i++){
            total += days[i];
        }
        total+=b;
        return total;
    }
}