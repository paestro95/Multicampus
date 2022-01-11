package Assignments.A1;

class Part {
    String name;
    int price;
}

class CPU extends Part {
    public CPU(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class Monitor extends Part {
    public Monitor(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class Keyboard extends Part {
    public Keyboard(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class Mouse extends Part {
    public Mouse(String name, int price) {
        this.name = name;
        this.price = price;
    }
}


public class Computer {
    public static void main(String[] args) {
        CPU cpu = new CPU("인텔", 350000);
        Monitor monitor = new Monitor("LG", 200000);
        Keyboard keyboard = new Keyboard("체리", 99000);
        Mouse mouse = new Mouse("로지텍", 30000);
        System.out.printf("* CPU : " + cpu.name + "\n* 가격: " + cpu.price);
        System.out.println("\n");
        System.out.printf("* 모니터 : " + monitor.name + "\n* 가격: " + monitor.price);
        System.out.println("\n");
        System.out.printf("* 키보드 : " + keyboard.name + "\n* 가격: " + keyboard.price);
        System.out.println("\n");
        System.out.printf("* 마우스 : " + mouse.name + "\n* 가격: " + mouse.price);

    }
}
