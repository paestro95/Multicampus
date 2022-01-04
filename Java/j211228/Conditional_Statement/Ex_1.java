package j211228.Conditional_Statement;

// 두 정수의 크기를 비교하여 왼쪽 수가 크면 left 를 출력, 오른쪽 수가 크면 right 를 출력, 같으면 equal 을 출력해주세요.
public class Ex_1 {
    public static void main(String[] args) {
        int left = 30;
        int right = 40;

        if (left > right) {
            System.out.println("left");
        } else if (left < right) {
            System.out.println("right");
        } else
            System.out.println("equal");
    }
}
