import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int index = str1.indexOf(str2);
        while(index!=-1){
            str1= str1.substring(0,index) + str1.substring(index+str2.length());
            index = str1.indexOf(str2);
        }
        System.out.printf("%s",str1);
    }
}