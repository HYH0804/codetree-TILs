import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = n1+n2;
        String n4= n2+n1;
        int num1= Integer.parseInt(n3);
        int num2 = Integer.parseInt(n4);
        System.out.printf("%d",num1+num2);

    }
}