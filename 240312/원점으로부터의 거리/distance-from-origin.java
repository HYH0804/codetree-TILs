import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Point[] arr = new Point[n]; 
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y =sc.nextInt();
            int dis = Math.abs(x)+ Math.abs(y);
            arr[i]=new Point(i,dis);
        }
        Arrays.sort(arr,new Comparator<Point>(){
            @Override
            public int compare(Point a , Point b){
                if(a.dis==b.dis){
                    return a.num-b.num;
                }
                return a.dis-b.dis;
            }
        });
        for(int i=0; i<n; i++){
            System.out.printf("%d\n",arr[i].num+1);
        }

    }
    public static class Point{

        private int num;
        private int dis;
        public Point(int num,int dis){
            this.num=num;
            this.dis=dis;
        }
    }
}