import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr1= str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for(int i =0; i<2; i++){
            arr2[i]=arr1[i];
        }
        str1=String.valueOf(arr2);
        System.out.printf("%s",str1);
    }
}