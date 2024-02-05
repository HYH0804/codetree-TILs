import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int[] array_n1=new int[n1];
        int[] array_n2 =new int[n2]; 
        for(int i =0; i<n1; i++){
            array_n1[i]=sc.nextInt();
        }
        for(int i =0; i<n2; i++){
            array_n2[i]=sc.nextInt();
        }

        boolean flag = false;
        for (int i =0; i<n1; i++){
            if(array_n1[i]==array_n2[0]){
                for(int j=0; j<n2;j++){
                    if(i+j>=n1 || array_n1[i+j]!=array_n2[j]){
                        break;
                    }
                    else if(j==n2-1){
                        flag=true;
                        break;
                    }
                }
            }
        }
        if (flag==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}