import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int c= sc.nextInt();
        int[][] array = new int[n+1][n+1];
        for(int i =0; i<c; i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            if(array[a][b]!=1){
                array[a][b]++;
            }
            else{
                continue;
            }
        }
        for(int i =1; i<n+1; i++){
            for(int j =1; j<n+1; j++){
                System.out.printf("%d ",array[i][j]);
            }
            System.out.println();
        }
    }
}