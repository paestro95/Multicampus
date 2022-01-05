package j211230.Method;

// 문제 : 입력받은 2가지 정수 사이에 존재하는 3의 배수 중에서 홀수의 합을 리턴하는 함수 구현
public class Ex_13 {
    public static void main(String[] args) {

        System.out.println("결과 : " + get_sum(50, 100));
        System.out.println("test");
        // 출력 => 675
    }

    // 어떤수가 홀수인지 아닌지 체크하는 함수
    public static int is_odd(int num) {
        if (num % 2 != 0) {
            return num;
        } else
            return 0;
    }

    // 어떤수가 3의 배수인지 아닌지 체크하는 함수
    public static int is_three_multiple(int num) {
        if (num % 3 == 0) {
            return num;
        } else
            return 0;
    }

    // is_odd와 is_three_multiple 이용해서 완성해주세요.
    public static int get_sum(int n, int m) {
        int sum = 0;
        for (int i = n; i < m; i++) {
            // 3의 배수만 받겠다.
            if (is_three_multiple(i) != 0) {
                // 3의 배수에서 홀수 값만 받겠다.
                if (is_odd(i) != 0) {
                    // 3의 배수에서 홀수값만 걸러진 i값만 해당 if문에 들어와있다.
                    // 그 i값을 sum을 하겠다
                    sum += i;
                }
            }
        }
        return sum;
    }
}