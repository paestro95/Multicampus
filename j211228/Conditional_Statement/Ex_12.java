package j211228.Conditional_Statement;

import java.util.Scanner;

/* 입력받은 정수 3개를 비교하여 최댓값을 구하시오. */

public class Ex_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();

        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        System.out.println("최대값 : " + max);
        scanner.close();
    }

}
