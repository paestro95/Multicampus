package j211228.Loop_Statement;

// 문제1. 1 ~ 100까지 수중 짝수만 출력
public class Ex_2 {
    // public static void main(String[] args) {

    // for (int i = 1; i <= 100; i++) {
    // if (i % 2 == 0) {
    // System.out.println(i);
    // }
    // }
    // }
    // }

    // 문제1. 1 ~ 100까지 수를 출력하는데 숫자 뒤에 짝수는 even, 홀수는 odd를 붙여서 출력
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "  even");
            } else
                System.out.println(i + "  odd");
        }
    }
}