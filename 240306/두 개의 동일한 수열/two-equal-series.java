import java.util.Scanner;
import java.util.Arrays; //sort
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        int[] arr1  = new int[l];
        int[] arr2  = new int[l];
        for(int i=0; i<l; i++){
            arr1[i]= sc.nextInt();
        }
        for (int i=0; i<l; i++){
            arr2[i]= sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}