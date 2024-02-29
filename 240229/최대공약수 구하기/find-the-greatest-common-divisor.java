import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        gcd(n,m);
    }
    public static void gcd(int n, int m){
        int max;
        if (n <m){
            max=m;
        }
        else{
            max=n;
        }
        int gcd =1;
        for(int i=1; i<=max; i++){
            if(n%i==0 && m%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}