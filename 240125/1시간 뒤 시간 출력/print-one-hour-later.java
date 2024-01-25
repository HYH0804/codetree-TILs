import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":");
        String s= sc.next();
        String a = sc.next();
        int b = Integer.parseInt(s);
        System.out.printf("%d:%s",b+1,a);
    }
}