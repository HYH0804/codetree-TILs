import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            int a= sc.nextInt();
            if(a == 1){
                str = str.substring(1,str.length()) + str.substring(0,1);
                System.out.printf("%s\n",str);
            }
            else if(a==2){
                str=str.substring(str.length()-1,str.length())+str.substring(0,str.length()-1);
                System.out.printf("%s\n",str);
            }
            else {
                char[] newArr = new char[str.length()];
                int j =0;
                char[] arr = str.toCharArray();
                for(int z =str.length()-1; z>=0;z--){
                    newArr[j]= arr[z];
                    j++;
                }
                str = String.valueOf(newArr);
                System.out.printf("%s\n",str);
            }
        }
    }
}