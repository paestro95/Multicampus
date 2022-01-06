package j211229.Array;

// 아래 2차원 배열의 값을 모두 출력해주세요
public class Ex_7 {
    public static void main(String[] args) {

        int[][] arr1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.println(arr1[i][j]);
            }
        }

        // 출력 :
        /*
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 7
         * 8
         * 9
         */

        System.out.println("============================================");

        int[][] arr2 = {
                { 1, 2 },
                { 3, 4, 5, 6 },
                { 7, 8, 9 },
                { 10 }
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }

        // 출력 :
        /*
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 7
         * 8
         * 9
         * 10
         */

    }
}