import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        boolean flag = false;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='('){
                for(int j=i; j<s.length();j++){
                    if(s.charAt(j)==')'){
                        count++;
                    }
                }
            }
        }
        System.out.printf("%d",count);
    }
}