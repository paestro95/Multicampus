package j211231;

public class Student {
    String name;
    int math;
    int korean;
    int english;

    double getSum() {
        return math + korean + english;
    }

    void sum() {
        System.out.println(name + "의 총점은 " + getSum());
    }

    void avg() {
        double avg = getSum() / 3;
        System.out.println(name + "의 평균은 " + avg);
    }
}
