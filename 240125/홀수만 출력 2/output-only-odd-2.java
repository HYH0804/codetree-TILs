import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        int start = sc.nextInt();
        for (int i=end; i>=start; i--){
            if(i%2==1){
                System.out.printf("%d ",i);
            }
        }
    }
}