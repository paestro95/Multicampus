package j211229.Array;

// 배열을 이용해 5개의 숫자를 입력받고 출력해주세요.

public class Ex_1 {
    public static void main(String[] args) {

        int[] number = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };

        for (int i = 0; i <= number.length; i++) {
            System.out.println(number[i]);
        }
    }

}
