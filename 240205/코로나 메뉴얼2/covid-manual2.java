import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int[] array = new int[4];
        while (cnt <3 ){
            char a= sc.next().charAt(0);
            int n = sc.nextInt();
            if (a=='Y'){
                if(n>=37){
                    array[0]++;
                }
                else{
                    array[2]++;
                }
            }
            else {
                if(n>=37){
                    array[1]++;
                }
                else{
                    array[3]++;
                }
            }
            cnt++;
        }
        for (int i=0; i<4; i++){
            System.out.printf("%d ",array[i]);
        }
        if (array[0]>=2){
            System.out.printf("E");
        }
    }
}