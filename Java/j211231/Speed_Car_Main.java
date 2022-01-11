package j211231;

// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.

public class Speed_Car_Main {
    public static void main(String[] args) {

        Speed_Car sCar = new Speed_Car();

        sCar.speed1();
        sCar.speed2();

        // 출력 : 자동차가 최대속력 220km로 달립니다.
        // 출력 : 자동차가 최대속력 250km로 달립니다.

    }
}