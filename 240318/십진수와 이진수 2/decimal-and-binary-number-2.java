import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        int n=0;
        for(int i=0; i< bin.length(); i++){
            n=n*2 + bin.charAt(i)-'0';
        }
        n*=17;
        int index=0; 
        int[] arr  = new int[16];
        while(true){
            if(n<2){
                arr[index++]=n;
                break;
            }
            else{
                arr[index++]= n%2;
                n/=2;
            }
        }
        for(int i=index-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}