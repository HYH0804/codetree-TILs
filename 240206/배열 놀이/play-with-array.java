import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        for (int j=0; j<q; j++){
            int p= sc.nextInt();
            if (p==1){
                int a= sc.nextInt();
                System.out.printf("%d\n",array[a-1]);
            }
            else if(p==2){
                int a= sc.nextInt();
                int index=0;
                for(int z=0 ; z<n; z++){
                    if(array[z]==a){
                        index=z;
                        break;
                    }
                }
                if(index ==0){
                System.out.printf("%d\n",index);
                }
                else{
                System.out.printf("%d\n",index+1);
                }
            }
            else{
                int a= sc.nextInt();
                int b=sc.nextInt();
                for(int l=a-1;l<=b-1;l++){
                    System.out.printf("%d ",array[l]);
                }
                System.out.println();

            }
        }
    }
}