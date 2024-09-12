import java.util.*;
public class Main {
    public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String n = sc.next();
    int digit = change(n,a);
    List<Integer> arr2 = changeDigit(b,digit);
    for(int k : arr2){
        System.out.printf("%d",k);
    }

    }
    public static int change(String n,int a){ //분리 , 거꾸로
        char[] arr = n.toCharArray();
        int total=0;
        for(int i=arr.length-1; i>=0; i--){
            total+=Math.pow(a,arr.length-i-1)*(arr[i]-'0');
        }
        return total;
    }
    public static List<Integer> changeDigit(int d,int n){
        List<Integer> list = new ArrayList<>();
        while(n>=d){
            list.add(n%d);
            n=n/d;
        }
        list.add(n);
        return list;
    }
    
}