import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start_day = 11;
        long start_hour = 11;
        long start_min = 11;
        long end_day= sc.nextInt();
        long end_hour=sc.nextInt();
        long end_min=sc.nextInt();
        long count =0;
        long timeStart= 11*24*60+11*60+11;
        long timeEnd = end_day*24*60+end_hour*60+end_min;
        if(timeStart>timeEnd){
            System.out.printf("-1");
        }
        else{
            System.out.printf("%d",timeEnd-timeStart);
        }
    }
}