import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Spec[] arr = new Spec[n];
        for(int i =0; i<n; i++){
            String str = sc.next();
            int a= sc.nextInt();
            int b= sc.nextInt();
            arr[i]= new Spec(str,a,b);
        }
        Arrays.sort(arr,(a,b)->(a.tall - b.tall));
        for(int i =0; i<n; i++){
            System.out.printf("%s %s %s\n",arr[i].name,arr[i].tall,arr[i].weight);
        }
    }


    public static class Spec{
        private String name;
        private int tall;
        private int weight;

        public Spec(String name,int tall,int weight){
            this.name = name;
            this.tall = tall;
            this.weight = weight;
        }
    }
}