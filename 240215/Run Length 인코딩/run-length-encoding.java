import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int[] array = new int[1000]; 
        int i=0;
        int j=0;
        while(i<s.length()){
            int c= s.charAt(i);
            int cnt=0;
            while(i<s.length() && c==s.charAt(i) ){
                cnt++;
                i++;
            }
            array[j]=(int)c;
            array[j+1]=cnt;
            j=j+2;
        }
        System.out.printf("%d\n",j);
        for(int z=0; z<j; z=z+2){
            System.out.printf("%c%d",(char)array[z],array[z+1]);
        }
    }
}