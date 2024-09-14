//offset 1000
// 0 ~ 2000
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x1A= sc.nextInt()+1000;
        int y1A= sc.nextInt()+1000;
        int x2A= sc.nextInt()+1000;
        int y2A= sc.nextInt()+1000;
        int x1B= sc.nextInt()+1000;
        int y1B= sc.nextInt()+1000;
        int x2B= sc.nextInt()+1000;
        int y2B= sc.nextInt()+1000;
        int x1M= sc.nextInt()+1000;
        int y1M= sc.nextInt()+1000;
        int x2M= sc.nextInt()+1000;
        int y2M= sc.nextInt()+1000;
        int[][] arr = new int[2000][2000];
            for(int j=x1A; j<x2A; j++){
                for(int z=y1A; z<y2A; z++){
                    if(arr[j][z]!=1){
                        arr[j][z]++;
                    }
                }
            }
            for(int j=x1B; j<x2B; j++){
                for(int z=y1B; z<y2B; z++){
                    if(arr[j][z]!=1){
                        arr[j][z]++;
                    }
                }
            }            
            for(int j=x1M; j<x2M; j++){
                for(int z=y1M; z<y2M; z++){
                    if(arr[j][z]==1){
                        arr[j][z]--;
                    }
                }
            }
            System.out.printf("%d",count(arr));
    }
    public static int count(int[][] arr){
        int total=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                if(arr[i][j]==1){
                    total++;
                }
            }
        }
        return total;
    }
}