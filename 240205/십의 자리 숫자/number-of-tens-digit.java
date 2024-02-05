import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int n = sc.nextInt();
        while(n!=0){
            array[n/10]++;
            n=sc.nextInt();
        }
        for(int i =1; i<10;i++){
            System.out.printf("%d - %d\n",i,array[i]);
        }
    }
}