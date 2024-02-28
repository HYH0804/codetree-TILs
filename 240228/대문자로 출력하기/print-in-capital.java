import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        for(int i =0 ; i<arr.length; i++ ){
            if('A'<= arr[i] && arr[i]<='Z'){
                System.out.printf("%c",arr[i]);
            }
            else if('a'<= arr[i] && arr[i]<='z'){
                System.out.printf("%c",arr[i]-'a'+'A');
            }
            else{
                continue;
            }
        }
    }
}