import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        int n = sc.nextInt();

        MV mv = new MV(str,str1,n);
        System.out.printf("secret code : %s\nmeeting point : %s\ntime : %d",mv.code,mv.meet,mv.time);
    }
    public static class MV {
        private String code;
        private String meet;
        private int time;

        public MV(String code,String meet, int time){
            this.code= code;
            this.meet=meet;
            this.time=time;
        }
    }
}