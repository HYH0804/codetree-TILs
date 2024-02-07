import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++){
            int temp = sc.nextInt();
            array[i]= temp;
        }
        int max = array[0];
        int index =0;
        for (int i =1; i<n; i++){
            if(max<array[i]){
                max=array[i];
                index=i;
            }
        }
        swap(array,0,index);

        max = array[1];
        index =1;
        for (int i =2; i<n; i++){
            if(max<array[i]){
                max=array[i];
                index=i;
            }
        }
        swap(array,1,index);

        System.out.printf("%d %d",array[0],array[1]);
    }
    static void swap(int[] array,int a , int b){
        int temp = array[a];
        array[a]=array[b];
        array[b]= temp;
    }
}