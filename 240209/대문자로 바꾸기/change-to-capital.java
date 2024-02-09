import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] array = new char[5][3];
        for(int i=0; i<5; i++){
            for(int j=0;j<3;j++){
                char c = sc.next().charAt(0);
                array[i][j] = (char)(c-32);
            }
        }
        for(int i=0; i<5; i++){
            for(int j=0;j<3;j++){
                System.out.printf("%c ",array[i][j]);
            }
            System.out.println();
        }
    }
}