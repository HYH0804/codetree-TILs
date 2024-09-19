import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[100];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int MIN_VALUE = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int total =0;
            for(int j=0; j<n; j++){
                total += Math.abs(j-i)*arr[j];
            }
            if(total<MIN_VALUE){
                MIN_VALUE = total;
            }
        }
        System.out.printf("%d",MIN_VALUE);
    }
}