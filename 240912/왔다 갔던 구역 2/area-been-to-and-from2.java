//-1000~1000
//0~1 크기 >> index 1
//-1000~-999 >> index -999
//999~1000 >> index 1000
//index = -999~1000
//출발 0 >> index 999
//index 1999까지
import java.util.*; 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2000];
        for(int i =0; i<2000;i++){
            arr[i]=0;
        }
        int location=999;
        for(int i =0; i<n; i++){
            int d= sc.nextInt();
            String w= sc.next();
            if(w.equals("R")){
                moveR(d,location,arr);
                location+=d;
            }
            else if(w.equals("L")){
                moveL(d,location,arr);
                location-=d;
            }
        }
        System.out.printf("%d",size(arr));

    }
    //시작 0
    //3 오른쪽
    //0~1 1~2 2~3 >> 1,2,3 index에 체크
    public static void moveR(int d,int location, int[] arr){
        for(int i=location+1; i<location+d+1; i++){
            arr[i]++;
        }
    }

    //시작 0
    //3 왼쪽
    // -3~-2 -2~-1 -1~0 >> -2 -1 0
    public static void moveL(int d,int location, int[] arr){
        for(int i=location; i>location-d;i--){
            arr[i]++;
        }
    }

    public static int size(int[] arr){
        int size=0;
        for(int i=0; i<2000; i++){
            if(arr[i]>1){
                size++;
            }
        }
        return size;
    }
}