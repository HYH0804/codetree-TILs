import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] arr = new Person[n];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            arr[i]=new Person(name, kor, eng, math);
        }
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if((o1.kor!=o2.kor)){
                    return o2.kor-o1.kor;
                }
                else if((o1.eng!=o2.eng)){
                    return o2.eng-o1.eng;
                }
                else{
                    return o2.math-o1.math;
                }
            }
        });
        print(arr);
    }
    public static void print(Person[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.printf("%s %d %d %d\n",arr[i].name , arr[i].kor,arr[i].eng, arr[i].math);
        }
    }
}
class Person {
    public String name;
    public int kor;
    public int eng;
    public int math;

    public Person(String a , int b, int c, int d){
        this.name=a;
        this.kor=b;
        this.eng=c;
        this.math=d;
    }
}