package j211230.Method;

public class Ex_7 {
    public static void main(String[] args) {
        greeting1(2);
        // 하이~
        greeting1(3);
        // 봉쥬
        greeting1(1);
        // 안녕하세요

        System.out.println("\n");

        greeting2(1, 3);
        // 안녕하세요
        // 안녕하세요
        // 안녕하세요
        greeting2(2, 5);
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        greeting2(3, 7);
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
    }

    static void greeting1(int i) {
        if (i == 1) {
            System.out.println("안녕하세요");
        } else if (i == 2) {
            System.out.println("하이~");
        } else if (i == 3) {
            System.out.println("봉쥬");
        }
    }

    static void greeting2(int i, int j) {
        for (int a = 0; a < j; a++) {
            if (i == 1) {
                System.out.println("안녕하세요");
            } else if (i == 2) {
                System.out.println("하이~");
            } else if (i == 3) {
                System.out.println("봉쥬");
            }
        }

    }

}
