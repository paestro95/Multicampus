package j211228.Conditional_Statement;

// 두수 num1과 num2가 주어집니다.
// 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.
public class Ex_2 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 15;

        if (num1 > num2) {
            System.out.println(num1 - num2);
        } else if (num2 > num1) {
            System.out.println(num2 - num1);
        } else
            System.out.println(0);
    }
}
