package j211228.Conditional_Statement;

// 문제) Switch / case문을 사용하여 짝수 및 홀수를 구분하고, 짝수 및 홀수 함수를 만들어서 호출하시오.

public class Ex_18 {
    public static void main(String[] args) {
        int i = 119;
        int j = i % 2;

        switch (j) {
            case 0:
                System.out.println("짝수");
                break;
            case 1:
                System.out.println("홀수");
                break;
            default:
                System.out.println("모르겠습니다");
        }

    }

}
