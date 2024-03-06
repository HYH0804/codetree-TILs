import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int index= sc.nextInt();
        int[] arr = new int[num];
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        System.out.printf("%d ",arr[index-1]);
        
    }
}