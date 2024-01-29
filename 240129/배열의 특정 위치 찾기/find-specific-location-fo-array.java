import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i=0; i< array.length; i++){
            array[i]=sc.nextInt();
        } 
        int avg=0;
        int avg_3=0;
        int cnt_3=0;
        for (int i=1; i< array.length; i+=2){
            avg+=array[i];
        } 
        for (int i=2; i< array.length; i+=3){
            avg_3+=array[i];
            cnt_3+=1;
        } 
        System.out.printf("%d %.1f",avg, (double) avg_3/cnt_3);
    }
}