import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = sc.next();
        int temp=0;
        for(int i =0; i<str.length(); i++){
            temp = str.charAt(i)-'0' + temp*a;
        }
        int index=0;
        int[] arr = new int[100];
        while(true){
            if(temp<b){
                arr[index++]=temp;
                break;
            }
            else{
                arr[index++]=temp%b;
                temp/=b;
            }

        }
        for(int i=index-1; i>=0; i--){
            System.out.print(arr[i]);
        }

    }
}