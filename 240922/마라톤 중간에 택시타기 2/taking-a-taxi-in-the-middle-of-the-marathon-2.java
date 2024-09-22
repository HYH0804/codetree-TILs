// (0,0) > (1000,1000)
// (-1000,-1000) > 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dot[] arr = new Dot[n];
        for(int i=0; i<n; i++){
            arr[i]=new Dot(sc.nextInt(),sc.nextInt());
        }

        //i=0일때 거리
        int min=Integer.MAX_VALUE;
        for(int i=1; i<n-1; i++){
            int total =0;
            for(int j=0; j<n-1; j++){
                if(j==i){
                    continue;
                }
                else if(j==i-1){
                    total+=distance(arr[j],arr[j+2]);
                }
                else{
                    total+=distance(arr[j],arr[j+1]);
                }
            }
            if(total<min){
                min=total;
            }
        }
        System.out.printf("%d",min);

    }
    static int distance(Dot a1,Dot a2){
        return Math.abs(a1.x-a2.x)+Math.abs(a1.y-a2.y);
    }
    
public static class Dot{
    int x;
    int y;
    public Dot(int x,int y){
        this.x=x;
        this.y=y;
    }
}
}