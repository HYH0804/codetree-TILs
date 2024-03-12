import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Score[] arr = new Score[n];
        for(int i=0; i<n; i++){
            String str = sc.next();
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c = sc.nextInt();
            arr[i]=new Score(str,a,b,c);
        }
        Arrays.sort(arr,(a,b)->(a.kor+a.eng+a.math)-(b.kor+b.eng+b.math));
        for(int i =0; i<n; i++){
            System.out.printf("%s %d %d %d\n",arr[i].name,arr[i].kor,arr[i].eng,arr[i].math);
        }        
    }
    public static class Score{
        private String name;
        private int kor;
        private int eng;
        private int math;

        public Score(String name,int kor, int eng, int math){
            this.name = name;
            this.kor=kor;
            this.eng=eng;
            this.math=math;
            }
        
        }
    }