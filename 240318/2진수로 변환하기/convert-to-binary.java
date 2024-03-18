import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[20];
        for(int i=0 ; i<20; i++){
            arr[i]=0;
        }
        int index=0;
        int cnt=0;
        while(true){
            
            if(n<2){
                arr[cnt++]=n;
                break;
            }
            else{
                arr[cnt++]=n%2;
                n=n/2;
            }
            index++;

        }
        for(int i=index; i>=0; i--){
            System.out.printf("%d",arr[i]);
        }
    }
}