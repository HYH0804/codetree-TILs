import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr= str.toCharArray();
        int[] arrInt= new int[arr.length];
        for(int i=0; i<arrInt.length; i++){
            arrInt[i]= (int) arr[i] - 48;
        }
        int num=0;
        for(int i=0; i<arrInt.length; i++){
            num=num*2+arrInt[i];
        }
        System.out.println(num);

    }
}