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
        int len=0;
        len = j/2;
        for(int z=1; z<j; z=z+2){
            if(0<array[z] && array[z]<10){
                len++;
            }
            else if(10<=array[z] && array[z]<100){
                len=len+2;
            }
            else if(100<=array[z] && array[z]<1000){
                len=len+3;
            }
        }
        System.out.printf("%d\n",len);
        for(int z=0; z<j; z=z+2){
            System.out.printf("%c%d",(char)array[z],array[z+1]);
        }
    }
}