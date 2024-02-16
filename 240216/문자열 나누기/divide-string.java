import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int index=0;
        char[] array = new char[1000];
        for(int i=0; i<n; i++){ 
            char[] arr= sc.next().toCharArray();
            for(int j=0; j<arr.length; j++){
                array[index]=arr[j];
                index++;
            }
        }
        int idx=0;
        while(idx<index){
            for(int i=0; idx<index && i<5; i++){
                System.out.print(array[idx]);
                idx++;
            }
            System.out.println();
        }
    }
}