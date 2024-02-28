import java.util.Scanner;
//index와 개수는 개수 = index + 1
// 따라서 index-개수 +1 을 해야됨 꼭 +1 필수. 왜냐하면 index 기준이니까
// next() 공백기준으로 자르고 nextLine()은 \n 기준으로 자름
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        if(str.contains("ee")){
            System.out.print("Yes ");
        }
        else{
            System.out.print("No ");
        }
        if(str.contains("ab")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}