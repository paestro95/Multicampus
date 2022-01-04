package j211228.Conditional_Statement;
import java.util.Scanner;

/* 문제) 키보드로 입력받은 숫자가 10보다 작으면 "10보다 작습니다."를 출력하시오. */

public class Ex_10 {
    public static void main(String[] args) {
        System.out.println("정수를 입력하시오.");
        
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 10) {
            System.out.println("10보다 작습니다.");
        } else
            System.out.println("10보다 큽니다.");
        scanner.close();
    }
}

/* 문제) 키보드로 입력받은 숫자가 2로 나누었을때 나머지가 0이면 "짝수입니다."를 출력하시오. */

// public class Ex_10{
//     public static void main(String[] args) {
//         System.out.println("정수를 입력하시오.");
//         Scanner scanner = new Scanner(System.in);
//         int num = scanner.nextInt();

//         if (num % 2 == 0) {
//             System.out.println("짝수입니다.");
//         } else
//             System.out.println("홀수입니다.");
//     }
// }

// /* 문제) 변수 a 는 4 이면서, 변수 b 는 짝수이고, 변수 c 는 true 가 아닐 경우 "정답입니다."를 출력하시오. */
// class Ex_10 {
//     public static void main(String[] args) {
//         int a = 4;
//         int b = 4;
//         boolean c = true;

//         if (a == 4 && b % 2 == 0 && c == true) {
//             System.out.println("정답입니다.");
//         } else
//             System.out.println("오답입니다.");
//     }
// }
