import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y =sc.nextInt();
        int cnt=0;
        for (int i =1; i <=y;i++){
            if(i%100==0 && i%400!=0){
                continue;
            }
            else if(i%4==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}