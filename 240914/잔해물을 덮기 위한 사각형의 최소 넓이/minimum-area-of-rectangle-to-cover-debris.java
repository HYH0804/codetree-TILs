//offset 1000
// (1,1) (2,2)
// 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2000][2000];
        int x1A = sc.nextInt()+1000;
        int y1A = sc.nextInt()+1000;
        int x2A = sc.nextInt()+1000;
        int y2A = sc.nextInt()+1000;
        int x1B = sc.nextInt()+1000;
        int y1B = sc.nextInt()+1000;
        int x2B = sc.nextInt()+1000;
        int y2B = sc.nextInt()+1000;
        for(int i=x1A; i<x2A; i++){
            for(int j=y1A; j<y2A; j++){
                arr[i][j]++;
            }
        }
        for(int i=x1B; i<x2B; i++){
            for(int j=y1B; j<y2B; j++){
                arr[i][j]++;
            }
        }
        int hd= x2A-x1A;
        int vd= y2A-y1A;
        if(isHorizental(arr,hd,x1A,x2A,y1A,y2A)||isVertical(arr,vd,x1A,x2A,y1A,y2A)){
            System.out.printf("%d",count(arr,x1A,x2A,y1A,y2A));
        }
        else{
            System.out.printf("%d",count2(x1A,x2A,y1A,y2A));
        }


    }
    public static int count(int[][] arr,int x1,int x2, int y1, int y2){
        int total=0;
        for(int i=x1; i<x2;i++){
            for(int j=y1; j<y2; j++){
                if(arr[i][j]>=1){
                    total++;
                }
                else if(arr[i][j]==2){
                    total--;
                }
            }
        }
        return total;
    }

    public static int count2(int x1,int x2, int y1, int y2){
        return (y2-y1)*(x2-x1);
    }
    public static boolean isHorizental(int [][] arr,int hd,int x1,int x2, int y1, int y2){
        boolean flag = false;
        boolean flag2 = false;
        int start=-1;
        int end=-1;
        for(int i=x1; i<x2; i++){
            for(int j=y1; j<y2; j++){
                if(flag2==false&&arr[i][j]==2){
                    flag2=true;
                    start=j;
                }
                else if(flag2==true&&arr[i][j]==2){ //end를 계속 업뎃
                    end=j;
                }
                else if(flag2==false&&arr[i][j]!=2){ //없을때
                    continue;
                }
                else if(flag2==true&&arr[i][j]!=2){
                    flag2=false;
                    break;
                }
            }
        }
        if((end-start)==hd){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isVertical(int [][] arr, int vd,int x1,int x2, int y1, int y2){
        boolean flag = false;
        boolean flag2 = false;
        int start=-1;
        int end=-1;
        for(int i=y1; i<y2;i++){
            for(int j=x1; j<x2; j++){
                if(flag2==false&&arr[j][i]==2){
                    flag2=true;
                    start=j;
                }
                else if(flag2==true&&arr[j][i]==2){ //end를 계속 업뎃
                    end=j;
                }
                else if(flag2==false&&arr[j][i]!=2){ //없을때
                    continue;
                }
                else if(flag2==true&&arr[j][i]!=2){
                    flag2=false;
                    break;
                }
            }
        }
        if(Math.abs(end-start)==vd){
            return true;
        }
        else{
            return false;
        }
    }
          
}