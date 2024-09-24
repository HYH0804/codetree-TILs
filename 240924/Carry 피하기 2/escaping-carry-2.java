import java.util.*;
public class Main {
    public static void main(String[] args) {
        boolean flag2=false;
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String[] arr2 = new String[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.next();
            arr2[i]=reverse(arr[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int z=j+1; z<n; z++){
                    boolean flag = false;
                    String n1 = arr2[i];
                    String n2 = arr2[j];
                    String n3 = arr2[z];
                    int index = Math.max(Math.max(n1.length(),n2.length()),n3.length())-1;
                    for(int k=0; k<index+1; k++){
                        Dto o = checkDigitsAndDto(k,n1,n2,n3);
                        if(o.flag==true){ //Carry 발생
                            flag=true;
                            break;
                        }
                    }
                    if(!flag){
                    int temp = Integer.parseInt(arr[i]) + Integer.parseInt(arr[j]) + Integer.parseInt(arr[z]);
                    if(temp > max){
                        max=temp;
                        flag2=true;
                    }
                    }
                    flag=false;
                }
            }
        }
        if(flag2){
        System.out.printf("%d",max);
        }
        else{
            System.out.printf("%d",-1);
        }


    }
    public static Dto checkDigitsAndDto(int index, String n1, String n2 , String n3){
        //index i , length i+1
        int i1 =0;
        int i2 =0;
        int i3= 0;
        if(n1.length()-1>=index){
            i1=n1.charAt(index)-'0';
        }
        else{
            //nothing
        }
        if(n2.length()-1>=index){
            i2=n2.charAt(index)-'0';
        }
        else{
            //nothing
        }
        if(n3.length()-1>=index){
            i3=n3.charAt(index)-'0';
        }
        else{
            //nothing
        }

        return new Dto(i1,i2,i3);
    }

    public static String reverse(String arr){
        char[] arr2= arr.toCharArray();
        char[] arr3 = new char[arr2.length];
        for(int i=0; i<arr3.length; i++){
            arr3[i]=arr2[arr2.length-i-1];
        }
        return String.valueOf(arr3);
    }

    static class Dto{
        //Carry 발생
        boolean flag=false;
        int add = -1;
        public Dto(int a, int b, int c){
            if(a+b+c>=10){
                this.flag=true;
            }
            else{
                this.add=a+b+c;
            }
        }
    }
}