import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        while(n>=2){
            list.add(n%2);
            n=n/2;
        }
        list.add(n);
        for(int i=list.size()-1; i>=0; i--){
            System.out.printf("%d",list.get(i));
        }
    }

}