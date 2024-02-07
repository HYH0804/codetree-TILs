import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        while (n!=999 && n!=-999){
            if(max<n){
                max=n;
            }
            if(min>n){
                min=n;
            }
            n = sc.nextInt();
        }
        System.out.printf("%d %d",max,min);
    }
}