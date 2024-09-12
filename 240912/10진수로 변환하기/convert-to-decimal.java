import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n= sc.nextInt();
        while(n>=10){
            list.add(n%10);
            n=n/10;
        }
        list.add(n);
        int total = 0;
        for(int i =0 ; i<list.size(); i++){
            total+=Math.pow(2,i)*list.get(i);
        }
        System.out.printf("%d",total);
    }
}