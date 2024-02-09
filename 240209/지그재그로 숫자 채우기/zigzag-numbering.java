import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] array = new int[n][m];
        for(int i =0; i<m; i++){ //array[j][i]
            if(i%2==0){
                for(int j=0; j<n;j++){
                    array[j][i]=num;
                    num++;
                }
            }
            else {
                for(int j=n-1; j>=0; j--){
                    array[j][i]=num;
                    num++;
                }
            }
        }
        for(int z=0; z<n; z++){
            for(int f=0; f<m; f++){
                System.out.printf("%d ",array[z][f]);
            }
            System.out.println();
        }
    }
}