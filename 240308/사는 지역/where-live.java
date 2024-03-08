import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Man[] arr = new Man[n];
        for (int i=0; i<n; i++){
            String str1 = sc.next();
            String str2= sc.next();
            String str3= sc.next();
            Man k = new Man(str1,str2,str3);
            arr[i]=k;
        }
        Arrays.sort(arr,new Comparator<Man>(){
            public int compare(Man m1 , Man m2){
                return m2.name.compareTo(m1.name);
            } 
        });
        System.out.printf("name %s\naddr %s\ncity %s",arr[0].name,arr[0].add,arr[0].region);
    }
    public static class Man {
        private String name;
        private String add;
        private String region;  

        public Man(){
        }
        public Man(String name,String add, String region ){
            this.name = name;
            this.add = add;
            this.region = region;
        }
    }
}