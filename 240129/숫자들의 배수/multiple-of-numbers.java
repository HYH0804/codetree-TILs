import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int cnt =0;
        int i=0;
        int[] array = new int[100];
        array[0]=n;
        while (cnt<2){
            array[i+1]=n*(i+2);
            if(array[i]%5==0){
                i++;
                cnt+=1;
            }
            else{
                i++;
            }
        }
        for (int j=0; j<i ;j++){
            System.out.printf("%d ",array[j]);
        }
    }
}