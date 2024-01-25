import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int i=0;
        System.out.printf("%d.",a/b);
        a=a%b;
        while(i<20){
            System.out.printf("%d",(10*a)/b);
            a=(10*a)%b;
            i++;

        }
    }
}