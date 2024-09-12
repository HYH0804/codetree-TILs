//타일 클래스 
// 현재색깔, B 내역 횟수 , W 내역 횟수
//1000*100 = -100000~100000
//오른쪽 기준
//-100000 >> index -99999 ~ 100000
//200000 개 
//시작 0 >> 99999
//움직이면서 Grey인지 매번 확인하고 아니면 B , W 카운트 올리고
//맞으면 그냥 스킵
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Tile[] arr = new Tile[200000];
        for(int i=0; i<arr.length; i++){
            arr[i]= new Tile();
        }
        int location = 99999;
        for(int i =0; i<n; i++){
            int d= sc.nextInt();
            String w = sc.next();
            if(w.equals("R")){
                moveR(location,d,arr);
                location+=d;
            }
            else if(w.equals("L")){
                moveL(location,d,arr);
                location-=d;
            }
        }
        System.out.printf("%d ",count("W",arr));
        System.out.printf("%d ",count("B",arr));
        System.out.printf("%d ",count("G",arr));

    }

    public static int count(String color, Tile[] arr){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].color.equals(color)){
                count++;
            }
        }
        return count;
    }

    //0시작 2만큼 이동
    //0~1 1~2 >> index 2까지
    public static void moveR(int location , int d , Tile[] arr){
        for(int i=location; i<location+d+1; i++){
            if(arr[i].isGreyAndChange()){ //이미 Grey이거나 Grey 조건 충족이면
                continue;
            }
            else { 
                arr[i].colorFillB();
            }
        }
    }
    //0시작 , 2만큼 이동
    //-2~-1 -1~0 >> index -1까지
    public static void moveL(int location , int d , Tile[] arr){
        for(int i=location; i>location-d; i--){
            if(arr[i].isGreyAndChange()){ //이미 Grey이거나 Grey 조건 충족이면
                continue;
            }
            else { 
                arr[i].colorFillW();
            }
        }
    }
    
}

static class Tile {
    public String color;
    public int countB;
    public int countW;

    public Tile(){
        this.countB=0;
        this.countW=0;
        this.color="N";
    }
    
    public void colorFillB(){
        this.countB++;
        color="B";
    }
    public void colorFillW(){
        this.countW++;
        color="W";
    }

    public boolean isGreyAndChange(){
        if(this.color.equals("G")){
            return true;
        }
        else if(this.countB>=2 && this.countW>=2){
            this.color="G";
            return true;
        }
        else{
            return false;
        }
    }
}