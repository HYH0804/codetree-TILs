import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[100];
        int n ;
        int num=0;
        for (int i =0; i<100; i++){
            n= sc.nextInt();
            array[i]=n;
            if (n==0){
                break;
            }
            else{
                num+=1;
            }
        }
        System.out.printf("%d",array[num-3]+array[num-2]+array[num-1]);
    }
}