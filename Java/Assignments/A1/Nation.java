// package Assignments.A1;
// /* 

// 과제1) Class Nation 을 만들고 나라이름, 면적, 인구수를 멤버 변수로 만들고, 나라이름변경(), 면적변경(), 인구수변경() 메소드를 만드시오.
// 과제2) Class Nation 을 상속한 나라를 3개 만들고, 나라별로 특수한 멤버변수 하나와 메소드 하나를 생성하시오.
// 과제3) Class Nation 을 나라이름을 private로 지정하고, 면적과 인구수는 public 으로 지정하시오.
// 과제4) Class Nation 을 만들고 행성이름을 만들고 static으로 지정하시오.

// */

// class Nation {
//     private String nationName;
//     public double area;
//     public int population;
//     static String planetName = "Mars";
 

//     void setNationName(String nationName) {
//         this.nationName = nationName;
//     }

//     void setArea(double area) {
//         this.area = area;
//     }

//     void setPopulation(int population) {
//         this.population = population;
//     }
    

// }

// class Korea extends Nation {
//     String song;
//     void setSong(String song) {
//         this.song = song;
//     }
// }

// class Japen extends Nation {
//     String food;
//     void setFood(String food) {
//         this.food = food;
//     }
// }

// class China extends Nation {
//     String culture;
//     void setCulture(String culture) {
//         this.culture = culture;
//     }
// }


// class Main{
 
//     public static void main(String[] args) {

//         Nation nation = new Nation();
//         Korea korea = new Korea();
//         Japen japen = new Japen();
//         China china = new China();

//         nation.area = 1.1;
//         nation.population = 3;
//         nation.setNationName("Korea");

//         System.out.println(nation.area);
//         System.out.println(nation.population);
//         System.out.println(korea.area);

        

//     }
// }
