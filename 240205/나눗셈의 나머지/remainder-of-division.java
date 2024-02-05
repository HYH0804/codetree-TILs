import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int[] array= new int[10];
        while(a>1){
            array[a%b]++;
            a=a/b;
        }
        int add =0;
        for(int i=0; i<10;i++){
            add=add+(array[i] * array[i]);
        }
        System.out.printf("%d",add);
    }
}