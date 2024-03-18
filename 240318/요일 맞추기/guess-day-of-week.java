import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2= sc.nextInt();
        int d2 = sc.nextInt();
        int day1=0;
        int day2=0;
        int day=0;
        String[] dow = new String[7];
        dow[0] = "Mon";
        dow[1] = "Tue";
        dow[2]="Wed";
        dow[3]="Thu";
        dow[4]="Fri";
        dow[5]="Sat";
        dow[6]="Sun";
        int[] endDay = new int[13];
        endDay[1] = endDay[3] = endDay[5] = endDay[7] = endDay[8] = endDay[10]  =  endDay[12] = 31;
        endDay[4] = endDay[6] = endDay[9] = endDay[11] = 30;
        endDay[2] = 28;

        for(int i =1; i<m1; i++){
            day1+=endDay[i];
        }  
        day1+=d1;
        for(int i =1; i<m2; i++){
            day2+=endDay[i];
        }  
        day2+=d2;
        if(day1<day2){
            day=(day2-day1)%7;
            System.out.println(dow[day]);
        }
        else{
            day=(day1-day2)%7;
            if(day==0){
                System.out.println(dow[0]);
            }
            else{
                System.out.println(dow[7-day]);
            }
        }

    }
}