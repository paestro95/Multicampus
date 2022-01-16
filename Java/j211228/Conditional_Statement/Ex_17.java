package j211228.Conditional_Statement;

import java.util.Scanner;

// 문제) 콜라는 800원, 사이다는 900원, 커피는 700이다. 콜라, 사이다, 커피 중에 하나의 문자를 입력해서 가격을 출력하는 프로그램을 작성하시오.

public class Ex_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String drink = sc.nextLine();
        int coke = 800;
        int cider = 900;
        int coffee = 700;

        switch (drink) {
            case "콜라":
                System.out.println("콜라는 " + coke + "원입니다.");
                break;

            case "사이다":
                System.out.println("사이다는 " + cider + "원입니다");
                break;

            case "커피":
                System.out.println("커피는 " + coffee + "원입니다.");
                break;

            default:
                System.out.println("판매하지 않는 음료입니다.");

        }
        sc.close();
    }
}
