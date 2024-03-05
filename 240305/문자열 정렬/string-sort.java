import java.util.Arrays; //Arrays.sort 땜에
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       String str =sc.next();
       char[] ch = str.toCharArray();
       Arrays.sort(ch);
       System.out.println(ch);
    }
}