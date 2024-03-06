import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int index= sc.nextInt();
        String[] arr= new String[n];
        String T = sc.next();
        List<String> colle = new ArrayList<String>();
        for(int i =0; i<arr.length; i++){
            arr[i]=sc.next();
        }
        char[] T_ch = T.toCharArray();
        boolean test = true;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<T_ch.length; j++){
                if(arr[i].charAt(j)!=T_ch[j]){
                    test=false;
                    break;
                }
            }
            if(test==false){
                test=true;
                continue;
            }
            else{
                colle.add(arr[i]);
            }
        }
        System.out.println(colle.get(index+1));

    }
}