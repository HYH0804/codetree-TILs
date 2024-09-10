import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Integer[] arr2= Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2,Collections.reverseOrder());
        Arrays.sort(arr);
        Main.print(arr);
        Main.print(arr2);
    }

    public static void print(Integer[] arr){
        for (int i =0; i<arr.length; i++){
            System.out.printf(arr[i]+" ");
        }
        System.out.println();
    }

    public static void print(int[] arr){
        for (int i =0; i<arr.length; i++){
            System.out.printf(arr[i]+" ");
            }
        System.out.println();
    }

    
}