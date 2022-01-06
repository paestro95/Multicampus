package j211229.Array;

// 배열을 두번 출력해주세요. 
class Ex_4 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }
        }

    }
}