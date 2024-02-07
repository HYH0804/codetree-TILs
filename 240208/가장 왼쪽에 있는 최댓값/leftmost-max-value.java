import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array=new int[n];
        for (int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int index =n-1;
        while(n>=1){
            for (int i=n-1; i>=0; i--){
                if(max<=array[i]){
                    max=array[i];
                    index =i;
                }            
            }
            System.out.printf("%d ",index+1);
            max = Integer.MIN_VALUE;
            n=index;
        }
    }
}