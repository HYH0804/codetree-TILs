import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n= sc.nextInt();
        char[] arr = str.toCharArray();
        for(int i =0 ; i<n; i++){
            if(sc.nextInt()==1){
                int a= sc.nextInt();
                int b= sc.nextInt();
                char temp = arr[a-1];
                arr[a-1]=arr[b-1];
                arr[b-1]=temp;
                System.out.printf("%s\n",String.valueOf(arr));
            }
            else{
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                for(int j =0; j<arr.length; j++){
                    if(arr[j]==a){
                        arr[j]=b;
                    }
                }
                System.out.printf("%s\n",String.valueOf(arr));
            }
        }
    }
}