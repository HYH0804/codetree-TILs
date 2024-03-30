import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int OFFSET = 100;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[200];
        Arrays.fill(arr,0);
        for(int i=0; i<n; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[start+OFFSET]++;
            arr[end+OFFSET-1]++;
        }
        int max = 0 ;
        for(int i=0; i<200; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}