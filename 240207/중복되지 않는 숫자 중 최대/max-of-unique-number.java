import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] array = new int[1001];
        int n =sc.nextInt();
        for(int i =0; i<n; i++){
            int num= sc.nextInt();
            array[num]++;
        }
        int index=-1;
        int max =0;
        for(int j=1; j<1001; j++){
            if(array[j]<=1 && array[j]>0 ){
                index=j;
            }
        }
        if(index ==-1){
            System.out.printf("%d",index);
        }
        else{
            System.out.printf("%d",index);
        }
    }
}