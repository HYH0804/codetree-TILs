import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr =s.toCharArray();
        
        if(isOnly1(s)){
            arr[arr.length-1]=0;
        }
        else{
            for(int i=0; i<s.length();i++){
                if(arr[i]=='0'){
                    arr[i]='1';
                    break;
                }
            }
        }
        System.out.printf("%d",tendigit(arr));
        
    }
    public static boolean isOnly1(String s){
        boolean flag = true;
        for (int i=0; i<s.length();i++){
            if(s.charAt(i)=='0'){
                flag=false;
            }
        }
        return flag;
    }
    public static int tendigit(char[] arr){
        int total =0;
        for(int i=arr.length-1; i>=0;i--){
            total += (arr[i]-'0')*(int)Math.pow(2,arr.length-1-i);
        }
        return total;
    }
}