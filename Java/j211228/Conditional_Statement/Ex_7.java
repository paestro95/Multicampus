package j211228.Conditional_Statement;

// 세 정수 중 두번째로 작은 수를 구해주세요.
public class Ex_7 {
    public static void main(String[] args) {
        // 아래 세 정수의 값을 바꿔가면서 테스트해보세요.
        int a = 15;
        int b = 12;
        int c = 24;

        // 출력 : 두번째로 작은 수는 12입니다.
        if (a > b && b > c) {
            System.out.println("두번째로 작은 수는: " + b + " 입니다.");
        } else if (c > b && b > a) {
            System.out.println("두번째로 작은 수는: " + b + " 입니다.");
        } else if (b > a && a > c) {
            System.out.println("두번째로 작은 수는: " + a + " 입니다.");
        } else if (c > a && a > b) {
            System.out.println("두번째로 작은 수는: " + a + " 입니다.");
        } else if (b > c && c > a) {
            System.out.println("두번째로 작은 수는: " + c + " 입니다.");
        } else if (a > c && c > b) {
            System.out.println("두번째로 작은 수는: " + c + " 입니다.");
        }
    }
}
