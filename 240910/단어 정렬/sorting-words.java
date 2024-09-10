import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
        Arrays.sort(str);
        for(String s : str){
            System.out.println(s);
        }
    }
}