import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];
        for(int i =0; i<10; i++){
            array[i]=sc.next();
        }
        char c = sc.next().charAt(0);
        for(int i=0; i<10; i++){
            int len = array[i].length();
            if(c==array[i].charAt(len-1)){
                System.out.println(array[i]);
            }
        }
    }
}