import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] arr = new Person[n];
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            arr[i]=new Person(a,b,i);
        }
        Arrays.sort(arr,new Comparator<Person>(){
            @Override
            public int compare(Person o1 , Person o2){
                if(o1.height!=o2.height){
                    return o2.height-o1.height;
                }
                else if(o1.weight != o2.weight){
                    return o2.weight-o1.weight;
                }
                else{
                    return o2.order - o1.order;
                }
            }
        });
        print(arr);   
    }
    public static void print(Person[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d %d %d",arr[i].height,arr[i].weight,arr[i].order+1);
            System.out.println();
        }
    }
}
class Person{
    public int height;
    public int weight;
    public int order;

    public Person(int height, int weight, int order) {
        this.height = height;
        this.weight = weight;
        this.order = order;
    }
}