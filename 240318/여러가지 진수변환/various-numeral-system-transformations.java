import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digit = sc.nextInt();
        int[] arr = new int[5];
        int index=0;
        while(true){
            if(N<digit){
                arr[index++]=N;
                break;
            }
            else{
                arr[index++]=N%digit;
                N/=digit;
            }
        }
        for(int i=0; i<index; i++){
            System.out.print(arr[index-1-i]);
        }
        

    }
}