import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];
        Arrays.fill(arr,0);
        for(int i =0; i<n; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int j=start; j<end+1; j++){
                arr[j]++;
            }
        }
        int max=0;
        for(int i =0; i<101; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}