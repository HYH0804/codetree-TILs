import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        char[] t1 = new char[10];
        char[] t2 = new char[10];
        int cnt1=0;
        int cnt2=0;
        for(int i =0; i<arr1.length; i++){
            if('0'<=arr1[i] && arr1[i]<='9'){
                t1[cnt1]=arr1[i];
                cnt1++;
            }
            if('0'<=arr2[i] && arr2[i]<='9'){
                t2[cnt2]=arr2[i];
                cnt2++;
            }
        }
        String a = "";
        String b = "";
        for(int i =0; i<cnt1; i++){
            a=a+String.valueOf(t1[i]);
            }
        for(int i =0; i<cnt2; i++){
            b=b+String.valueOf(t2[i]);
            }
        System.out.printf("%d",Integer.parseInt(a)+Integer.parseInt(b));
    }
}