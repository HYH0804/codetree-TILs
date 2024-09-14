import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int count=1;
        int max =0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(i==0 || arr[i]!=arr[i-1]){
                if(max<count){
                    max=count;
                }
                count=1;
            }
            else if(arr[i]==arr[i-1]){
                count++;
            }
        }
        System.out.printf("%d",max);
    }
}