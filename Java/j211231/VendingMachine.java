package j211231;

class VendingMachine {
    int inputMoney;
    int getBeverage;
    int balance;
    String rst;

    void setInputedMoney(int inputMoney) {
        this.inputMoney = inputMoney;
        System.out.println("현재 투입된 금액은 " + inputMoney + "원입니다");
    }

    void printAllBeverages() {
        System.out.println("0. 콜라 : 1000원");
        System.out.println("1. 사이다 : 1200원");
        System.out.println("2. 커피 : 800원");
    }

    String getBeverage(int input) {
    
        if(input==0){
            System.out.println("콜라를 뽑으셨습니다.");
            System.out.println("잔액은 "+ (inputMoney-1000) +"원입니다.");
            rst = "콜라";
        }
        else if (input==1){
            System.out.println("사이다를 뽑으셨습니다.");
            System.out.println("잔액은 "+ (inputMoney-1200) +"원입니다.");
            rst = "사이다";
        }
        else if (input==2){
            System.out.println("커피를 뽑으셨습니다.");
            System.out.println("잔액은 "+ (inputMoney-800) +"원입니다.");
            rst = "커피";
        }
    
        
        return rst;
    }

}


