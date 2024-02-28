import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int cnt1=0;
        int cnt2=0;
        for( int i =0; i<str1.length(); i++){
            if('0'<=arr1[i] && '9'<=arr1[i]){
                cnt1++;
            }
            else{
                break;
            }
        }
        for( int j =0; j<str1.length(); j++){
            if('0'<=arr2[j] && '9'<=arr2[j]){
                cnt2++;
            }
            else{
                break;
            }
        }
        str1=str1.substring(0,cnt1+2);
        str2=str2.substring(0,cnt2+2);
        System.out.printf("%d",Integer.parseInt(str1)+Integer.parseInt(str2));
    }
}