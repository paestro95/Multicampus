package j211228.Conditional_Statement;

/*
세 개의 직선이 있습니다.

숫자의 의미는 직선의 길이. 이 직선으로 삼각형을 만들 수 있는지 판단하는 프로그램을 작성해주세요

* 삼각형 성립조건
가장 긴 변 길이 < 나머지 변의 길이 합 

*/
public class Ex_9 {
    public static void main(String[] args) {
    
        int a = 7;
        int b = 11;
        int c = 6;
        
        int max = c;
        int other_sum = a + b;
        
        if(a > b) {
          if(a > c) {
            max = a;
            other_sum = b+c;
          } 
        } else {
          if(b > c) {
            max = b;
            other_sum = a+c;
          } 
        }
    
        if(max < other_sum) {
          System.out.println("o");
        } else {
          System.out.println("x");
        }
      }
    }