import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        double a=(double)h/100;
        if(w/(a*a) >=25){
            System.out.printf("%d\n",(int)(w/(a*a)));
            System.out.printf("Obesity");
        }
        else{
            System.out.printf("%d",(int)(w/(a*a)));
        }
    }
}