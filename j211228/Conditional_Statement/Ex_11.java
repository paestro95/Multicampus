package j211228.Conditional_Statement;

/* 0~100까지의 난수를 생성하여 아래와 같이 출력하시오 
               60점 이하 : 가
               61 ~ 70 : 양 
               71 ~ 80 : 미
               81 ~ 90 : 우
               91 이상 : 수
*/

public class Ex_11 {
    public static void main(String[] args) {
        double dValue = Math.random();
        int randomValue = (int) (dValue * 100);
        System.out.println(randomValue);

        if (randomValue > 90) {
            System.out.println("수");
        } else if (randomValue > 80) {
            System.out.println("우");
        } else if (randomValue > 70) {
            System.out.println("미");
        } else if (randomValue > 60) {
            System.out.println("양");
        } else
            System.out.println("가");

    }
}
