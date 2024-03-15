import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start_day = 11;
        int start_hour = 11;
        int start_min = 11;
        int end_day= sc.nextInt();
        int end_hour=sc.nextInt();
        int end_min=sc.nextInt();
        int count =0;
        while(start_day != end_day || start_hour!= end_hour || start_min != end_min){
            count++;
            start_min++;
            if(start_min==60){
                start_min=0;
                start_hour++;
            }
            if(start_hour==24){
                start_hour=0;
                start_day++;
            }
        }
        System.out.printf("%d",count);
    }
}