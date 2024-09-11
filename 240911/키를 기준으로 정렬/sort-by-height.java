import java.util.*;

class Person{ 
    public String name;
    public int height;
    public int weight;

    public Person(String a, int b, int c){
        this.name = a;
        this.height = b;
        this.weight = c;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] arr = new Person[n];
        for(int i=0; i<n; i++){
            String s = sc.next();
            int a = sc.nextInt();
            int b=  sc.nextInt();
            arr[i]= new Person(s,a,b);
        }
        Arrays.sort(arr,(a,b)-> a.height - b.height);
        print(arr);
    }

    public static void print(Person[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.printf("%s %d %d",arr[i].name,arr[i].height,arr[i].weight);
            System.out.println();
        }
    }
}