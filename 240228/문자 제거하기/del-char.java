import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        while(str.length()>1){
            int n = sc.nextInt();
            if(n>=str.length()){
                n=str.length()-1;
            }
            str = str.substring(0,n)+str.substring(n+1);
            System.out.println(str);
        }
    }
}