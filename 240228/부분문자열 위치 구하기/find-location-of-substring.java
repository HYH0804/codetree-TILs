import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        String f = sc.next();
        int index=-1;
        for(int i =0; i<str.length()-f.length()+1;i++){
            boolean exists = true;
            for(int j=0; j<f.length(); j++){
                if(exists == false || str.charAt(i+j)!=f.charAt(j)){
                    exists=false;
                    break;
                }
            }
            if(exists==true){
                index=i;
                break;
            }
        }
        System.out.println(index);

    }
}