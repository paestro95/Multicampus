package j211228.Conditional_Statement;

import java.util.Scanner;

/* 문제1) userID가 1이면 관리자 2이면 판매자 3이면 구매자이다. userID를 확인하여 누가 로그인했는지 출력하시오. */
/* 문제2) userID가 1이면 관리자 2이면 판매자 3이면 구매자이다. userID를 확인하여 누가 로그인했는지 출력하고 관리자의 경우 password 가 1234와 일치하면 "관리자로 로그인 하였습니다."를 출력하시오. */

public class Ex_14 {
    public static void main(String[] args) {
        System.out.println("userID를 입력해주세요. (1. 관리자 / 2.판매자 / 3. 구매자)");
        Scanner scanner = new Scanner(System.in);

        int userID = scanner.nextInt();
        if (userID == 1) {
            System.out.println("비밀번호를 입력해주세요.");
            int userPassword = scanner.nextInt();
            if (userPassword == 1234) {
                System.out.println("관리자로 로그인 하였습니다.");
            } else
                System.out.println("비밀번호가 틀렸습니다.");
        } else if (userID == 2) {
            System.out.println("판매자로 로그인 하였습니다.");
        } else if (userID == 3) {
            System.out.println("구매자로 로그인 하였습니다.");
        }
        scanner.close();
    }

}
