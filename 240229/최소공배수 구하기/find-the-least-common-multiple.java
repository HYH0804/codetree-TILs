import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        lcm(n,m);

    }
    public static void lcm(int n, int m){
        int gcd=1; 
        int max;
        
        if(n<m){
            max=m;
        }
        else{
            max=n;
        }
        for(int i=1; i<=max; i++){
            if(n%i==0 && m%i==0){
                gcd=i;
            }
        }
        int lcm=1;
        if(gcd==1){
            lcm=n*m;
        }
        else{
            lcm=gcd * (n/gcd) * (m/gcd);
        }
        System.out.println(lcm);
    }
}