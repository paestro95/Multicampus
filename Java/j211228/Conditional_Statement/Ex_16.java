package j211228.Conditional_Statement;

import java.util.Scanner;

/* 문제) Switch / case문을 사용하여 짝수이면 "짝수입니다." 홀수이면 "홀수입니다."를 출력하시오. */

public class Ex_16 {
    public static void main(String[] args) {
        System.out.println("정수를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println(num + " 값은 짝수입니다.");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(num + " 값은 홀수입니다.");
                break;
        }
        scanner.close();

    }

}