package j211228.Loop_Statement;
// 1부터 100까지의 합을 구해주세요.

public class Ex_5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        // 출력 : 5050

    }
}
