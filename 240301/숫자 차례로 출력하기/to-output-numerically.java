import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printing(n,1);
        System.out.println();
        printing2(n);
    }
    public static void printing(int n,int now){
        if(now>n){
            return;
        }
        System.out.printf("%d ",now);
        printing(n,now+1);
    }
    public static void printing2(int n){
        if(n==0){
            return;
        }
        System.out.printf("%d ",n);
        printing2(n-1);
    }
}