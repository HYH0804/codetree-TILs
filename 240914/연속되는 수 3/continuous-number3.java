import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int max=1;
        for(int i=0; i<n; i++){
            if(i!=0 && !isToggle(arr,i)){
                count++;
            }
            else{
                count=1;
            }
            if(max<count){
                max=count;
                }
        }
        System.out.printf("%d",max);

    }

    public static boolean isToggle(int[] arr,int i){
        if(arr[i]*arr[i-1]<0){
            return true;
        }
        else{
            return false;
        }
    }
}