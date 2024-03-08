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
                String[] ar = new String[2];
                ar[0] = m1.name;
                ar[1] = m2.name;
                Arrays.sort(ar);
                if(ar[0].equals(m1.name)){
                    return 0;
                }
                else{
                    return 1;
                }
            } 
        });
        System.out.printf("name %s\naddr %s\ncity %s",arr[n-1].name,arr[n-1].add,arr[n-1].region);
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