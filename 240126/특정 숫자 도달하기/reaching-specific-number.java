import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] array = new int[10];
        for (int i =0; i<10; i++){
            int a= sc.nextInt();
            if(a<250){
                array[i]=a;
            } 
            else{
                break;
            }
        }
        int sumVal=0;
        for(int j=0; j<array.length; j++){
            sumVal+=array[j];
        }
        int cnt=0;
        for(int z=0; z<array.length; z++){
            if(array[z]!=0){
                cnt+=1;
            }
        }
        System.out.printf("%d %.1f",sumVal,(double)sumVal/cnt);
    }
}