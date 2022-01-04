package j211228.Loop_Statement;
// n부터 m까지의 수중 k의 배수인 수들의 합 구하기

public class Ex_6 {
    public static void main(String[] args) {
        int n = 3; // 시작 수 : [3]
        int m = 20; // 끝 수 : [20]
        int k = 4; // 배수 : [4]

        int sum = 0;

        for (int i = n; i <= m; i++) {
            if (i % k == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum); // 결과 : 60

        int a = 5; // 시작 수 : [5]
        int b = 30; // 끝 수 : [30]
        int c = 6; // 배수 : [6]

        int sum2 = 0;

        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                sum2 = sum2 + i;
            }
        }
        System.out.println(sum2);

        // 결과 : 90

    }
}
