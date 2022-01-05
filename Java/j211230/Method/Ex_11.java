package j211230.Method;

// 1 부터 n까지 수 중 짝수인 것만 출력
public class Ex_11 {
    public static void main(String[] args) {

        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5); // 출력: 2 4

    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else
            return false;

    }

    public static void printEven(int n) {

        for (int i = 1; i <= n; i++) {
            boolean b = isEven(i); // isEven 메서드를 이용.
            if (b) {
                System.out.println(i);
            }

        }
    }

}
