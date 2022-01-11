package j211231;

// 문제 : 사람 3명을 저장할 수 있는 배열을 만들고 사람으로 채워주세요. 3명의 사람에게 자기소개를 시켜보세요.
// 안녕하세요~
public class 사람메인 {
    public static void main(String[] args) {

        사람[] 사람들 = new 사람[3];

        사람들[0] = new 사람();
        사람들[1] = new 사람();
        사람들[2] = new 사람();

        for (int i = 0; i < 사람들.length; i++) {
            사람들[i].자기소개();
        }
    }

}
