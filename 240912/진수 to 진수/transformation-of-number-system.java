import java.util.*;
public class Main {
    public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
    List<Integer> arr = change(n);
    int digit = changef(a,arr);
    List<Integer> arr2 = changeDigit(b,digit);
    for(int k : arr2){
        System.out.printf("%d",k);
    }

    }
    public static List<Integer> change(int n){ //분리 , 거꾸로
        List<Integer> list = new ArrayList<>();
        while(n>=10){
            list.add(n%10);
            n=n/10;
        }
        list.add(n);
        return list;
    }

    public static int changef(int d,List<Integer> arr){
        int total=0;
        for(int i =0; i<arr.size(); i++){
            total +=Math.pow(d,i)*arr.get(i);
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