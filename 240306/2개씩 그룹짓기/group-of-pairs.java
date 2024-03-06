import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2*N];
        
        for(int i =0; i<2*N;i++){
            arr[i]=sc.nextInt();
        }
        int max= arr[0]+arr[2*N-1];
        Arrays.sort(arr);
        for(int i=1; i<N; i++){
            int temp= arr[i]+arr[2*N-1-i];
            max=Math.max(temp,max);
        }
        System.out.println(max);
    }
}