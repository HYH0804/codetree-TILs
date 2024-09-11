import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] arr = new Person[n];
        for(int i=0; i<n; i++) {
            String name = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr[i]=new Person(name, a, b, c);
        }
        Arrays.sort(arr,(o1,o2)->(o1.a+o1.b+o1.c)-(o2.a+o2.b+o2.c));
        print(arr);
    }
    public static void print(Person[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.printf("%s %d %d %d",arr[i].name,arr[i].a,arr[i].b,arr[i].c);
            System.out.println();
        }
    }
}
class Person{
    String name;
    int a;
    int b;
    int c;

    public Person(String name, int a, int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }
}