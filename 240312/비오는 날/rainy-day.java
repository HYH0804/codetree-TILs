import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Rain[] ra = new Rain[n];

        for (int i=0; i<n; i++){
            String str1 = sc.next();
            String str2 = sc.next();
            String str3 = sc.next();
            ra[i]=new Rain(str1,str2,str3);
        }
        List<Integer> index = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(ra[i].Weth.equals("Rain")){
                index.add(i);       
            }
        }
        int z= index.get(0);
        for(int k : index){
            String[] str_array1 = ra[k].Date.split("-");
            String[] str_array2 = ra[z].Date.split("-");
            int year1 = Integer.parseInt(str_array1[0]);
            int year2 = Integer.parseInt(str_array2[0]);
            int month1= Integer.parseInt(str_array1[1]);
            int month2=Integer.parseInt(str_array2[1]);
            int day1=Integer.parseInt(str_array1[2]);
            int day2=Integer.parseInt(str_array2[2]);
            if(year1<year2){
                z=k;
            }
            else if(year1==year2) {
                if(month1 < month2){
                    z=k;
                }
                else if(month1 == month2){
                    if(day1 < day2){
                        z=k;
                    }
                }
            }
        }
        System.out.printf("%s %s %s",ra[z].Date,ra[z].Day,ra[z].Weth);
        

    }  
    public static class Rain {
        private String Date;
        private String Day;
        private String Weth;

        public Rain(){
        }
        public Rain(String Date,String Day,String Weth){
            this.Date = Date;
            this.Day = Day;
            this.Weth =Weth;
        }

    }
}