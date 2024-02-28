import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String f = sc.next();
        int n = str.indexOf(f);
        if(n!=-1){
            System.out.printf("%d",n);
        } 
        else{
            System.out.printf("No");
        }
    }
}