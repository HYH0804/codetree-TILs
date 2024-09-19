// 인덱스 == 시간
// 배열 값 == 위치
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        int[] posA = new int[1000001];
        int[] posB = new int[1000001];
        posA[0]=0;
        posB[0]=0;
        int locationA=1;
        int locationB=1;
        for(int i=0; i<n; i++){
            char d = sc.next().charAt(0);
            int num = sc.nextInt();
            while(num-->0){
                if(d=='R'){
                    posA[locationA]=posA[locationA-1]+1;
                }
                else{
                    posA[locationA]=posA[locationA-1]-1;
                }
                locationA++;
            }
        }

        for(int i=0; i<m; i++){
            char d = sc.next().charAt(0);
            int num = sc.nextInt();
            while(num-->0){
                if(d=='R'){
                    posB[locationB]=posB[locationB-1]+1;
                }
                else{
                    posB[locationB]=posB[locationB-1]-1;
                }
                locationB++;
            }
        }
        for(int i=1; i<1000001; i++){
            if(posA[i]==posB[i]){
                System.out.printf("%d",i);
                break;
            }
        }
                
    }
}