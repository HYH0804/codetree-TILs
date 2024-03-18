import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=0;
        }
        for(int i =0; i<K; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            if(start!=end){
                for(int j=start; j<=end; j++){
                    arr[j]++;
                }
            }
            else{
                arr[start]++;
            }
        }
        int maxIndex =0;
        for(int i =1; i<N; i++){
            if(arr[maxIndex]<arr[i]){
                maxIndex=i;
            }
        }
        System.out.print(arr[maxIndex]);


    }
}