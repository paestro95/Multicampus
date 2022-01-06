package j211229.Array;

// 배열을 이용해 5개의 과일(문장)을 입력받고 출력해주세요.
public class Ex_2 {
    public static void main(String[] args) {
        String[] fruit = { "사과", "바나나", "딸기", "포도", "귤" };

        for (int i = 0; i <= fruit.length; i++) {
            System.out.println(fruit[i]);
        }

    }
}
