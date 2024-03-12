import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Rain near = new Rain("9999-99-99" ,"fas","Rain");    

        for (int i=0; i<n; i++){
            String str1 = sc.next();
            String str2 = sc.next();
            String str3 = sc.next();
            Rain temp= new Rain(str1,str2,str3);
            if(temp.Weth.equals("Rain")){
                if(temp.Date.compareTo(near.Date)<0){
                    near = temp;
                }
            }
        }
        
        System.out.printf("%s %s %s",near.Date,near.Day,near.Weth);
        

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