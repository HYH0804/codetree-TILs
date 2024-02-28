import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i =0 ; i<str.length()+1;i++){
            System.out.printf("%s\n",str);
            str= str.substring(str.length()-1,str.length())+str.substring(0,str.length()-1);
        }
    }
}