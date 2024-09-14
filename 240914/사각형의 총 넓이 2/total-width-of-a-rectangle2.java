//offset 100
//0~200
// (0,1) ~ (3,4) >> (100,101) ~ (103,104)
// (2,2) ~ (5,3) >> (102,102) ~ (105,103)



import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[200][200];
        int n =sc.nextInt();
        for(int i=0; i<n; i++){
            int x1= sc.nextInt()+100;
            int y1=sc.nextInt()+100;
            int x2= sc.nextInt()+100;
            int y2= sc.nextInt()+100;
            for(int z=x1; z<x2; z++){
                for(int j=y1; j<y2; j++){
                    if(arr[z][j]==1){
                        continue;
                    }
                    else{
                        arr[z][j]++;
                    }
                }
            }
        }
        System.out.printf("%d",count(arr));
    }
    public static int count(int[][] arr){
        int total=0;
        for(int i=0 ; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                if(arr[i][j]==1){
                    total++;
                }
            }
        }
        return total;
    }
}