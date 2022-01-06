package j211229.Array;

public class Ex_6 {
      public static void main(String[] args) {
      
      // v1 아래 배열의 값중 짝수만 출력
      int[] arr = {2,45,12,4,21,6,17,2,8,10};

      for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                  System.out.println(arr[i]);
            }
      }

      // v2 배열의 값중 짝수의 합 출력       
      int sum=0;
      for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                  sum += arr[i];
            }
      }
      System.out.println(sum);
}
     
}
