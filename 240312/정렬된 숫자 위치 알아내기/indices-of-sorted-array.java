import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Num[] arr = new Num[n];
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            arr[i]= new Num(num,i);
        }
        Arrays.sort(arr,new Comparator<Num>(){
            @Override
            public int compare(Num a , Num b){
                if(a.num==b.num)
                    return a.order-b.order;
                return a.num-b.num;
            }
        });
        for(int i =0; i<n; i++){ 
            for(int j=0; j<n; j++){
                if(arr[j].order==i){
                    System.out.printf("%d ",j+1);
                }
            }
        } 
        
    }
    public static class Num{
        private int num;
        private int order;
        public Num(int num,int order){
            this.num=num;
            this.order=order;
        }
    }
}