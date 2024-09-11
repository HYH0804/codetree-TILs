import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = new Point(a, b,i);
        }
        Arrays.sort(arr,new Comparator<Point>(){
            @Override
            public int compare(Point o1 , Point o2){
                int index = (Math.abs(o1.x) + Math.abs(o1.y)) - (Math.abs(o2.x) + Math.abs(o2.y));
                if(index!=0){
                    return index;
                }
                else{
                    return o1.order - o2.order;
                }
            }
        });
        print(arr);
    }
    public static void print(Point[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d",arr[i].order+1);
            System.out.println();
        }
    }
}
class Point {
    public int x;
    public int y;
    public int order;
    public Point(int x, int y,int order) {
        this.x = x;
        this.y = y;
        this.order = order;

    }
}