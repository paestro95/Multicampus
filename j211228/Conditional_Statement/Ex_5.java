package j211228.Conditional_Statement;

// if, else if, else 를 이용해서 가위바위보 프로그램을 작성해주세요.
// mine, yours 값에 따라 이겼다. 비겼다. 졌다 출력
public class Ex_5 {
    public static void main(String[] args) {
        // 1. 가위, 2. 바위, 3. 보

        int mine = 3;
        int yours = 2;

        if (mine == 1 && yours == 2) {
            System.out.println("졌습니다.");
        } else if (mine == 1 && yours == 3) {
            System.out.println("이겼습니다.");
        } else if (mine == 2 && yours == 1) {
            System.out.println("이겼습니다.");
        } else if (mine == 2 && yours == 3) {
            System.out.println("졌습니다.");
        } else if (mine == 3 && yours == 1) {
            System.out.println("졌습니다.");
        } else if (mine == 3 && yours == 2) {
            System.out.println("이겼습니다.");
        } else if (mine == yours) {
            System.out.println("비겼다.");
        }

    }
}
