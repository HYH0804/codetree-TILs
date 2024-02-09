import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=1;
        int n=sc.nextInt();
        int[][] array= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                array[j][i]=num;
                num++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                System.out.printf("%d ",array[i][j]);
            }
            System.out.println();
        }
    }
}