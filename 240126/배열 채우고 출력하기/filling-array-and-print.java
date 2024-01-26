import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char[] array = new char[10];
        for(int i=0; i<10; i++){
            array[i]= sc.next().charAt(0);
        }
        for(int j=9; j>=0; j--){
            System.out.printf("%c",array[j]);
        }
    }
}