import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int a =0 ;
        int b= 0;
        int c =0;
        int count =0;
        for(int i=0; i<n; i++){
            a=arr[i];
            for(int j=i+1; j<n; j++){
                if(a<=arr[j]){
                    b=arr[j];
                    for(int z=j+1; z<n; z++){
                        if(b<=arr[z]){
                            c=arr[z];
                            count++;
                        }
                    }
                }
            }
            
        }
        System.out.printf("%d",count);
    }
}