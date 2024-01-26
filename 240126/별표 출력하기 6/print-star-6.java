import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        for(int i =0; i<a; i++){
            for(int j=0; j<2*i;j++){
                System.out.print(" ");
            }
            for(int z=0; z<2*(a-i)-1; z++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1; i<a;i++){
            for (int k=0; k<=a-(2*(i-1));k++){
                System.out.print(" ");
            }
            for(int z=0; z<2*i+1; z++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}