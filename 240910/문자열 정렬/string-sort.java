import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        print(arr);

    }
    public static void print(char[] chr){
        for(int i=0; i<chr.length; i++){
            System.out.print(chr[i]);
        }
    }
}