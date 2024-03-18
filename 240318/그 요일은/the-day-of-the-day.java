import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] day = new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        int m1 = sc.nextInt();
        int d1= sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String countDay = sc.next(); 
        int diff = count(m2,d2)-count(m1,d1);
        int count =0;
        int index=0;
        for(int i=0; i<day.length; i++){
            if(day[i].equals(countDay)){
                index =i;
                break;
            }
        }
        int simulIndex=index;
        while(simulIndex<=diff){
            simulIndex+=7;
            count++;
        }
        System.out.println(count);
    }
    
    public static int count(int m, int d){
        int[] dow = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        int dayCount=0;
        for(int i=1; i<m; i++){
            dayCount+=dow[i];
        }
        return dayCount+d;
    }
}