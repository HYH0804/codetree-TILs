import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int cnt_12 =0 ;
        int cnt_3 = 0;
        int cnt_2=0;
        for (int i =0; i<=a; i++){
            if (i%12==0 && i!=0){
                cnt_12++;
            }
            else if(i%3==0 && i!=0){
                cnt_3++;
            }
            else if(i%2==0 && i!=0){
                cnt_2++;
            }
            else{
                continue;
            }
        }
        System.out.printf("%d %d %d",cnt_2,cnt_3,cnt_12);
    }
}