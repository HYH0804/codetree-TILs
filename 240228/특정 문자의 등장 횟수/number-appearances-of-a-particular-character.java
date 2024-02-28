import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ee="ee";
        String eb="eb";
        int ee_n=0;
        int eb_n=0;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)=='e' && str.charAt(i+1)=='e'){
                ee_n++;
            }
            if(str.charAt(i)=='e' && str.charAt(i+1)=='b'){
                eb_n++;
            }
        }
        System.out.print(ee_n+" " + eb_n);
    }
}