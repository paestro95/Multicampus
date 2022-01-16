package j211227;

/* 변수를 이용해 코드 간단히 하기 */
public class Ex_5 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i <= 10;i++) {
        if (i%3==0)
        continue;
        sum += i;
        }
        System.out.println(sum);
        }
}