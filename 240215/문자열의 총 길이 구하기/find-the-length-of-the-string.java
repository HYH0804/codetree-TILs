import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];
        int cnt =0;
        for(int i =0; i<10; i++){
            array[i]=sc.next();
            cnt+=array[i].length();
        }
        System.out.println(cnt);
    }
}