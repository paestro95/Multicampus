package j211230.Method;

public class Ex_10 {
    public static void main(String[] args) {

        // 0은 양수로 보겠습니다.
        int no = 1;

        if (isNegative(no)) {

            System.out.println("음수입니다.");

        } else {

            System.out.println("양수입니다.");

        }
        // no 값을 바꿔가면서 테스트해보세요.
    }

    static boolean isNegative(int num) {
        if (num < 0) {
            return true;
        } 
        else
           return false;
    }
    
}
