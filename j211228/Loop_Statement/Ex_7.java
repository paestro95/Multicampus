package j211228.Loop_Statement;
//구구단을 2 ~ 9단까지 출력해주세요.

public class Ex_7 {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
