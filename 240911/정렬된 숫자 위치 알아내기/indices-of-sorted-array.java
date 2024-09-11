import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = new Point(a, i);
        }
        Arrays.sort(arr,new Comparator<Point>(){
            @Override
            public int compare(Point o1, Point o2){
                if(o1.x != o2.x){
                    return o1.x-o2.x;
                }
                else{
                    return o1.order-o2.order;
                }
            }
        });
        print(arr);

    }
    public static void print(Point[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j].order==i){
                    System.out.printf("%d ",j+1);
                }
            }
        }
    }
}
class Point {
    public int x;
    public int order;
    public Point(int x,int order) {
        this.x = x;
        this.order = order;

    }
}