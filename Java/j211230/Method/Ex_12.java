// package j211230.Method;

// public class Ex_12 {
//     public static void main(String[] args) {

//         // 1. 구구단 7단을 출력해주는 메서드를 만들어주세요.
//         gugu1(); // 7단 출력
//         System.out.println();

//         // 2. 구구단 원하는 단을 출력해주는 메서드를 만들어주세요.(매개변수)
//         gugu2(3); // 3단 출력
//         System.out.println();
//         gugu2(5); // 5단 출력
//         System.out.println();
//         gugu2(6); // 6단 출력
//         System.out.println();

//         // 3. 구구단을 1단부터 원하는 단까지 출력해주는 메서드를 만들어주세요.(매개변수)
//         gugu3(5); // 1~5단 까지 출력
//         System.out.println();
//         gugu3(11); // 1~11단 까지 출력
//         System.out.println();
//         gugu3(100); // 1~100단 까지 출력
//         System.out.println();

//         // 4. 원하는 이름을 출력해주는 메서드를 만들어주세요(매개변수)
//         printName("홍길동"); // 홍길동 출력

//         // 5. 자신의 이름을 리턴하는 메서드를 만들고 변수 my_name에 저장해주세요. 그리고 my_name을 출력해주세요.(리턴)
//         String myname = getName();

//         // 6. 원하는 수를 제곱해서 리턴해주는 메서드를 만들어주세요, 그리고 num1 변수에 저장해주세요. num1을 출력해주세요.(매개변수, 리턴)

//         int num1 = square(10);
//         System.out.println(num1); // 100 출력

//         // 7. 원하는 수를 제곱한 후 2로 나눈 값을 리턴해주는 메서드를 만들어주세요. 단, 제곱은 위에서 만들어진 메서드를 이용해야만 합니다.
//         //  제곱해주는 코드를 중복해서 사용하지 말아주세요. num2에 저장해주세요. 그리고 num2를 출력해주세요.(매개변수, 리턴)

//         int num2 = calc2(6);
//         System.out.println(num2); // 18 출력

//         // 8. 1부터 임의의 수까지 사이에 있는 짝수들의 합을 리턴하는 메서드를 만들어주세요. 마찬가지로 짝수 판별 코드를 중복해서 작성하지말고 
//         // 이미 만들어진 짝수판별 메서드를 이용해주세요. 그리고 num3에 저장해주세요. num3를 출력해주세요.(매개변수, 리턴)

//         int num3 = calc(10);
//         System.out.println(num3); // 30 출력

//         }

//         public static boolean isEven(int no) {
//         if(no % 2 == 0) {
//         return true;
//         }

//         return false;

//     }

//     static void gugu1() {
//         int i = 7;
//         for (int j = 1; j <= 9; j++) {
//             System.out.println(i + " * " + j + " = " + i * j);
//         }
//     }

//     static void gugu2(int dan) {
//         for (int i = 1; i <= 9; i++) {
//             System.out.println(dan + " * " + i + " = " + dan * i);
//         }
//     }

//     static void gugu3(int limit) {
//         for (int dan = 1; dan <= limit; dan++) {
//             for (int i = 1; i <= 9; i++) {
//                 System.out.println(dan + " * " + i + " = " + dan * i);
//             }
//         }
//     }

//     static void printName(String name) {
//         System.out.println(name);
//     }




// static void setName(String name){
    
// }

// static void getName(){
    
// }

// }
