import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Spec[] arr = new Spec[n];
        for(int i=0; i<n; i++){
            int t= sc.nextInt();
            int w= sc.nextInt();
            arr[i]= new Spec(t,w,i);
        }
        Arrays.sort(arr,new Comparator<Spec>(){
            @Override
            public int compare(Spec a, Spec b){
                if(b.tall ==a.tall) {
                    if(b.weight==a.weight){
                        return a.num - b.num;
                    }
                    else{
                        return b.weight-a.weight;
                    }
                }
                else{
                    return b.tall-a.tall;
                }
        }
    });
        for(int i =0; i<n; i++){
            System.out.printf("%d %d %d\n",arr[i].tall,arr[i].weight,arr[i].num+1);
        }        
        
    }
    public static class Spec{
        private int tall;
        private int weight;
        private int num;
        public Spec(int tall,int weight,int num){
            this.tall = tall;
            this.weight=weight;
            this.num =num;
        }
    }
}