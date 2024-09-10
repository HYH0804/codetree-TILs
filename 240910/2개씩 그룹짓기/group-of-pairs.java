import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * 2;  // 입력받은 수의 두 배 크기
        int[] arr = new int[n];  // 원본 배열
        int[] arr2 = new int[n]; // 복사 배열
        
        // 배열에 값 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열 복사
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }

        // 배열을 오름차순 정렬
        Arrays.sort(arr);

        // Integer[] 배열을 만들어서 내림차순 정렬
        Integer[] arr3 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
        Arrays.sort(arr3, Collections.reverseOrder());

        // findMin 메서드 호출
        System.out.print(findMin(arr, arr3));
    }

    public static int findMin(int[] arr, Integer[] arr2) {
        int max = Integer.MIN_VALUE;  // 비교를 위한 초기 큰 값 설정
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + arr2[i] > max) {
                max = arr[i] + arr2[i];
            }
        }
        return max;
    }
}