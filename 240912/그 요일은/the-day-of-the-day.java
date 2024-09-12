import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1=  sc.nextInt();
        int m2= sc.nextInt();
        int d2= sc.nextInt();
        String s = sc.next();

        int diff = days(m2,d2)-days(m1,d1);
        System.out.printf("%d",(diff/7)+1);        
        
        
    }

    public static int days(int a, int b ) { //1/1 ~ a/b 까지 
        int[] arr= new int[] {0,31,29,31,30,31,30,31,31,30,31,30,31};
        int total =0;
        for(int i =0; i<a; i++){
            total+=arr[i];
        }
        total+=b;
        return total;

    }
}