//Index
// 0 1 2 3 4
// ----------
// 4 7 8 6 4
// 인풋
// 0번째 방에서 시작
// 4 7 8 6 4
// 4*0 + 7*1 + 8*2 + 6*3 + 4*4
// 1번째 방에서 시작
// 4*4 + 7*0 + 8*1 + 6*2 + 4*3  = 8 12 12 16 = 48
// 2번째 방에서 시작
// 4*3 + 7*4 + 8*0 + 6*1 + 4*2
// 0 1 2 3 4 
// 4 0 1 2 3
// 3 4 0 1 2  
// 2 3 4 0 1 


import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        int[] arr2= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int total = Integer.MAX_VALUE;
        for(int i=0; i<n; i++ ){
            for(int j=0; j<n; j++){ //i-j
                if(n-i+j<n){
                    arr2[j]=n-i+j;
                }
                else{
                    arr2[j]= j-i;
                }
            }
            if(total>distance(arr,arr2)){
                total = distance(arr,arr2);
            }
        }
        System.out.printf("%d",total);
    }

    public static int distance(int[] arr, int[] arr2){
        int total =0;
        for(int i=0; i<arr.length; i++){
            total+= arr[i]*arr2[i];
        }
        return total;
    }
}