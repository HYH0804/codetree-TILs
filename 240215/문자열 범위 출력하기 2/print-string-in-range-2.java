import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        int n=sc.nextInt();
        int cnt=0;
        for(int i=s.length()-1;i>=0 && cnt!=n;i--){
            System.out.printf("%c",s.charAt(i));
            cnt++;
        }
    }
}