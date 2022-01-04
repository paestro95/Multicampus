package j211228.Conditional_Statement;

/* else if를 사용하여 주사위의 번호를 뽑으시오. */

public class Ex_13 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        if (num == 1) {
            System.out.println(num + "번이 나왔습니다.");
        } else if (num == 2) {
            System.out.println(num + "번이 나왔습니다.");
        } else if (num == 3) {
            System.out.println(num + "번이 나왔습니다.");
        } else if (num == 4) {
            System.out.println(num + "번이 나왔습니다.");
        } else if (num == 5) {
            System.out.println(num + "번이 나왔습니다.");
        } else if (num == 6) {
            System.out.println(num + "번이 나왔습니다.");
        }
    }

}
