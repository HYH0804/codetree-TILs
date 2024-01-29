import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] array= new int[100];
        for (int i=0; i<100; i++){
            n = sc.nextInt();
            if(n==0){
                break;
            }
            else{
                array[i]=n;
            }
        }
        for (int j=0; j<100; j++){
            if (array[j]%2==0 && array[j]!=0){
                System.out.printf("%d ",array[j]/2);
            }
            else if(array[j]%2!=0){
                System.out.printf("%d ",array[j]+3);
            }
            else{
                break;
            }
        }
    }
}