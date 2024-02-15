import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[]{"apple","banana","grape","blueberry","orange"};
        char c = sc.next().charAt(0);
        int count =0;
        boolean flag = false;
        for(int i=0; i<array.length; i++){
            for(int j=2;j<4 && flag!=true; j++){
                if(c==array[i].charAt(j)){
                    flag=true;
                    System.out.println(array[i]);
                }
                else{
                    continue;
                }
            }
            if(flag==true){
                count++;
                flag=false;
            }
            else{
                continue;
            }
        } 
        System.out.printf("%d",count);
    }
}