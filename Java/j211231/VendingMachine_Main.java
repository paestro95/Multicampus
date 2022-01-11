// package j211231;
// import java.util.Scanner;

// public class VendingMachine_Main {

//     public static void main(String[] args) {
		
// 	  VendingMachine vm = new VendingMachine();
// 	  Scanner sc = new Scanner(System.in);

//     System.out.print("돈을 투입해주세요 : ");
//     int inputMoney = sc.nextInt();
//   	vm.setInputedMoney(inputMoney);
//     // 출력 : 현재 투입된 금액은 2000원입니다.

//     System.out.println("음료수를 선택해주세요 : ");
//     vm.printAllBeverages();
//     // 출력 : 0.콜라 : 1000
//     // 출력 : 1.사이다 : 1200
//     // 출력 : 2.커피 : 800
//     int no = sc.nextInt();


// 	String rst = vm.getBeverage(no);
//     // 출력 : 사이다를 뽑으셨습니다.
//     // 출력 : 잔액은 800원입니다.

// 		 System.out.println(rst);
//     // 출력 : 사이다

//     String rst2 = vm.getBeverage(0);
//     // 출력 : 잔액이 부족합니다.

//     System.out.println(rst2);
//     // 출력 : null

// 		vm.setInputedMoney(500);
//     // 출력 : 현재 투입된 금액은 1300원입니다.
		
//     String rst3 = vm.getBeverage(0);
//     // 출력 : 콜라를 뽑으셨습니다.
//     // 출력 : 잔액은 300원입니다.
// 		System.out.println(rst3);
//     // 출력 : 콜라
		
		
// 	}
// }