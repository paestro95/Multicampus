package j211228.Conditional_Statement;

// 운세 프로그램을 작성해주세요.
// 세 정수, 순서대로 년도, 월, 일이 있습니다.
//  (년 - 월 + 일)에 마지막 숫자가 0이면 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력해주세요.

public class Ex_6 {
    public static void main(String[] args) {
        int year = 2020;
        int month = 10;
        int day = 5;
        int result = year - month + day;

        if (result % 10 == 0) {
            System.out.println("대박");
        } else
            System.out.println("그럭저럭");
    }
}
