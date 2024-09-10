import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        String arr[] = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0; i<n ; i++){
            if(count==k){
                System.out.printf("%s",arr[i]);
                break;
            }
            if(isStart(arr[i],T)){
                count++;
            }
        }


    }
    public static boolean isStart(String str , String test){
        char[] s = str.toCharArray();
        char[] t = str.toCharArray();
        boolean flag = true;
        for(int i=0; i<test.length(); i++){
            if(!(s[i]==t[i])){
                flag=false;
                break;
            }
        }
        return flag;
    }
}