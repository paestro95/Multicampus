package j211227;


// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.
public class Ex_2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        a = 10;
        b = 5;
        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 : b : 5
    }
}
