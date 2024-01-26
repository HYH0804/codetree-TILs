import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        for (int i=a; i>0; i--){
            for(int z=0; z<2*(a-i); z++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}