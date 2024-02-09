import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] array= new int[a][b];
        int num = 1;
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                array[i][j]=num;
                num++;
            }
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.printf("%d ",array[i][j]);
            }
        }
        System.out.println();
    }
}