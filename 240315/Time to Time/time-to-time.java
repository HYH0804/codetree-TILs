import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int start_hour= sc.nextInt();
        int start_min=sc.nextInt();
        int end_hour=sc.nextInt();
        int end_min=sc.nextInt();
        int count=0;
       while(start_hour!=end_hour || start_min!=end_min){
        count++;
        if(start_min==60){
            start_hour++;
            start_min=1;
        }
        else{
            start_min++;
        }
       }
       System.out.printf("%d",count);
    }
}