import java.util.*;
public class Main {
    public static class MV{
        private String cn;
        private int point;

        public MV(){

        }

        public MV(String cn,int point){
            this.cn=cn;
            this.point=point;
        }

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        MV[] mv = new MV[5];
        for(int i=0; i<5; i++){
            String s = sc.next();
            int n = sc.nextInt();
            mv[i]=new MV(s,n);
        }
        Arrays.sort(mv,new Comparator<MV>(){
            public int compare(MV m1 , MV m2){
                return m1.point-m2.point;
            }
        });
        System.out.printf("%s %d",mv[0].cn,mv[0].point);
    }
}