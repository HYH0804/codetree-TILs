import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)(sc.next().charAt(0));
        int b = (int)(sc.next().charAt(0));
        if( a> b){
            System.out.printf("%d %d",a+b,a-b);
        }
        else{
            System.out.printf("%d %d",a+b,b-a);
        }

    }
}